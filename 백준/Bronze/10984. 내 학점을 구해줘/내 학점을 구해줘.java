import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int C = 0;
			double GPA = 0.0;

			int N = Integer.parseInt(br.readLine());

			for (int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int c = Integer.parseInt(st.nextToken());
				double g = Double.parseDouble(st.nextToken());

				C += c;
				GPA += g*c;
				
			}
			
			sb.append(C).append(" ").append(Math.round(GPA / C * 10) / 10.0).append("\n");

		}
		System.out.println(sb);
	}
}
