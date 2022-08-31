import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T, R, num;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			R = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			String tmp = "";
			for (int j = 0; j < s.length(); j++) {
				String r = String.valueOf(s.charAt(j));
				for (int k = 0; k < R; k++) {
					tmp += r;
				}
			}
			sb.append(tmp).append("\n");
		}
		System.out.println(sb);
	}

}
