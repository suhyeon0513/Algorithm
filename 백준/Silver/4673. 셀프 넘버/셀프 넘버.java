import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] arr = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			String s = String.valueOf(i);
			int sum = i;
			for (int j = 0; j < s.length(); j++) {
				sum += Integer.parseInt(String.valueOf(s.charAt(j)));
			}
			if(sum <= 10000)
				arr[sum] = true;
		}
		
		for (int i = 1; i < 10000; i++) {
			if(!arr[i])
				System.out.println(i);
		}

	}
}
