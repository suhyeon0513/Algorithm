import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int R, C, ans = Integer.MAX_VALUE;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static Queue<int[]> water, queue;
	static boolean foundAnswer;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 티떱숲의 지도는 R행 C열
		st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		// S(시작), .(물), D(목적지), *(물)
		map = new char[R][C];
		water = new LinkedList<>();
		queue = new LinkedList<>();
		
		for (int i = 0; i < R; i++) {
			String s = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j);	
				
				if (map[i][j] == 'S') {
					queue.add(new int[] { i, j, 0 });
				} else if (map[i][j] == '*') {
					water.add(new int[] { i, j });
				}
			}
		}
		
		BFS();

		if (ans == Integer.MAX_VALUE) {
			System.out.println("KAKTUS");
		} else {
			System.out.println(ans);
		}
	}

	private static void BFS() {

		while (!queue.isEmpty()) {
			int size = water.size();

			for (int i = 0; i < size; i++) {
				int[] cur = water.poll();

				for (int j = 0; j < 4; j++) {
					int nr = cur[0] + dr[j];
					int nc = cur[1] + dc[j];

					if (0 <= nr && nr < R && 0 <= nc && nc < C) {
						if (map[nr][nc] == '.') {
							map[nr][nc] = '*';
							water.add(new int[] { nr, nc });
						}
					}
				}
			}

//			p();
//			System.out.println("-----------");

			size = queue.size();
			for (int i = 0; i < size; i++) {

				int[] move = queue.poll();
				int cnt = move[2];

				for (int j = 0; j < 4; j++) {
					int nr = move[0] + dr[j];
					int nc = move[1] + dc[j];

					if (0 <= nr && nr < R && 0 <= nc && nc < C) {
						if (map[nr][nc] == 'D') {
							ans = Math.min(ans, cnt + 1);
							return;
						} else if (map[nr][nc] == '.') {
							map[nr][nc] = 'S';
							queue.add(new int[] { nr, nc, cnt + 1 });
						}
					}
				}
			}

		}
	}

	private static void p() {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
}