import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int n;
	static int[] input; // 입력받은 수를 저장할 배열
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.valueOf(br.readLine());

		input = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = i + 1;
		}

		do {
			for (int i : input) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
		} while (np(input));
		System.out.println(sb);
	}

	public static boolean np(int[] numbers) {

		int N = numbers.length;
		int i = N - 1;
		while (i > 0 && numbers[i - 1] >= numbers[i])
			--i;
		if (i == 0)
			return false;

		int j = N - 1;
		while (numbers[i - 1] >= numbers[j])
			--j;

		swap(numbers, i - 1, j);

		int k = N - 1;
		while (i < k)
			swap(numbers, i++, k--);

		return true;

	}

	private static void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}

} // end of class