import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int cnt = 0;
		String s = br.readLine();

		int[] arr = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 };
		int time = 0;
		for (int j = 0; j < s.length(); j++) {
			time += arr[s.charAt(j) - 'A'];
			time++;
		}
		System.out.println(time);
	}
}
