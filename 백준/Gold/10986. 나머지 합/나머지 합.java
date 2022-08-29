import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int totalCnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long[] arr = new long[N];  // 합배열
		st = new StringTokenizer(br.readLine(), " ");
		arr[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());  // 누적 합
		}

		long ans = 0;
		long[] C = new long[M];  // 합배열
		for (int i = 0; i < N; i++) {
			int remainder = (int) (arr[i] % M);
			// 0~i 까지의 구간 합 자체가 0일 때 정답에 더하기
			if(remainder == 0) ans++;
			// 나머지가 같은 인덱스의 개수 세기
			C[remainder]++;
		}

		for (int i = 0; i < M; i++) {
			if(C[i] > 1) {
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
				ans = ans + (C[i] * (C[i] - 1) / 2);
			}
		}
		
		System.out.println(ans);

	}

}
