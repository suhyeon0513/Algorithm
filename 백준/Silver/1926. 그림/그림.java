import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N, M, cnt;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static ArrayList<Integer> list = new ArrayList<>();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && arr[i][j] != 0) {
                    cnt = 0;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        if (!list.isEmpty()) {
            Collections.sort(list, Collections.reverseOrder());

            System.out.println(list.size());
            System.out.println(list.get(0));
        } else {
            System.out.println(0);
            System.out.println(0);

        }
    }  // end of main

    private static void dfs(int r, int c) {

        visited[r][c] = true;

        cnt++;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (check(nr, nc)) continue;

            if (!visited[nr][nc] && arr[nr][nc] == 1) {
                dfs(nr, nc);
            }
        }

    }

    private static boolean check(int nr, int nc) {
        return nr < 0 || nr >= N || nc < 0 || nc >= M;
    }

}  // end of class