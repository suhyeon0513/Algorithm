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
			StringTokenizer st = new StringTokenizer(br.readLine(), "-");
			String a = st.nextToken();
			
			long cmp1 = 0;
			for (int j = 0, idx = 2; j < 3; j++, idx--) {
				cmp1 += (a.charAt(j) - 'A')*Math.pow(26, idx);
			}
			
			long cmp2 = Integer.parseInt(st.nextToken());
			
			if(Math.abs(cmp1 - cmp2) <= 100)
				sb.append("nice").append("\n");
			else 
				sb.append("not nice").append("\n");
		}
		
		System.out.println(sb);
		
	}

}
