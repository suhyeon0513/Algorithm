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

		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int M = Integer.parseInt(br.readLine());

			String s = Integer.toBinaryString(M);
			
			for (int j = s.length()-1, idx = 0; j >= 0; j--, idx++) {
				if(s.charAt(j) == '1') {
					sb.append(idx).append(" ");
				}
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb);
		
	}

}
