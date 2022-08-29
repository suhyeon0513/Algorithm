import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (int i = 1; i <= 5; i++) {
			String s = br.readLine();
			
			if(s.contains("FBI")) {
				flag = true;
				sb.append(i).append(" ");
			}
			
		}
	
		if(flag == false)
			System.out.println("HE GOT AWAY!");
		else
			System.out.println(sb);
	}
}
