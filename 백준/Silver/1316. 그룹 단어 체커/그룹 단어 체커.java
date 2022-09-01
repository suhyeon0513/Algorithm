import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < T; i++) {
			String s = br.readLine();

			boolean flag = true;
			int[] arr = new int[26];
			for (int j = 0; j < s.length(); j++) {
				if (arr[s.charAt(j)-'a'] == 0)
					arr[s.charAt(j)-'a'] = 1;
				else if (arr[s.charAt(j)-'a'] == 1) {
					if (s.charAt(j-1) != s.charAt(j)) {
						flag = false;
						break;
					}
				}
			}
			if (flag)
				cnt++;
		}
		System.out.println(cnt);
	}
}
