import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M, K, X;
	static int[] visited;
	static List<Integer> ans;
	static ArrayList<Integer> graph[];
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 도시의 개수 N, 도로의 개수 M, 거리 정보 K, 출발 도시의 번호 X
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		
		ans = new ArrayList<Integer>();  // 정답 리스트
		
		graph = new ArrayList[N+1];  // 그래프 저장 인접 리스트
		for (int i = 0; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
		}

		visited = new int[N+1];
		for (int i = 0; i <= N; i++) {
			visited[i] = -1;
		}
		
		BFS(X);
		
		for (int i = 0; i <= N; i++) {
			if(visited[i] == K) 
				ans.add(i);  // 방문 거리가 K인 노드의 숫자를 정답 리스트에 저장
		}
		
		if(ans.isEmpty())
			System.out.println("-1");
		else {
			Collections.sort(ans);  // 오름차순으로 정렬해 출력
			for (int i : ans) {
				System.out.println(i);
			}
		}
	}

	private static void BFS(int Node) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);  // 출발 노드 queue에 넣기
		
		visited[Node]++;  // 현재 방문 노드 기록
		
		while(!queue.isEmpty()) { 
			int now = queue.poll();
			
			for (int i : graph[now]) {
				if(visited[i] == -1) {
					// 큐에 데이터 삽입 -> visited 배열에 방문 거리 기록 = 이전 노드의 방문 거리 + 1
					visited[i] = visited[now] + 1;
					queue.add(i);
				}
			}
		}
		
	}
}
