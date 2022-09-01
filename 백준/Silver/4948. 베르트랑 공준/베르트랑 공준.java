import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int size = 123456 * 2 + 1;
		
		int[] arr = new int[size];
		for (int i = 2; i < size; i++) {
			arr[i] = i;
		}

		for (int i = 2; i < Math.sqrt(size); i++) {
			if (arr[i] == 0)
				continue;

			for (int j = i + i; j < size; j = j + i) {
				arr[j] = 0;
			}
		}

		while (true) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;

			if (n == 0)
				break;
			for (int i = n+1; i <= 2 * n; i++) {
				if (arr[i] != 0) {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}
