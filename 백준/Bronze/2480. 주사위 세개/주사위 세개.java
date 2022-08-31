import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int[] arr = new int[3];
		arr[0] = A;
		arr[1] = B;
		arr[2] = C;

		int max = Arrays.stream(arr).max().getAsInt();

		if (A == B && B == C)
			System.out.println(10000 + A * 1000);
		else if (A != B && B != C && A != C) {
			System.out.println(max * 100);
		} else if (A == B && B != C) {
			System.out.println(1000 + A * 100);
		} else if (A == C && A != B) {
			System.out.println(1000 + A * 100);
		} else if (B == C && A != B) {
			System.out.println(1000 + B * 100);
		}
	}

}
