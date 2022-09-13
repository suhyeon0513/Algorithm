import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] input;
    static boolean[] visited;
    static int[] numbers;
    static ArrayList<Integer> res = new ArrayList<>();
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        input = new int[N];
        visited = new boolean[N];
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        perm(0);

        Collections.sort(res, Collections.reverseOrder());

        System.out.println(res.get(0));

    } // end of main

    private static void perm(int cnt) {
        if (cnt == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(numbers[i] - numbers[i + 1]);
            }
            res.add(sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i])
                continue;
            
            numbers[i] = input[cnt];
            visited[i] = true;
            perm(cnt + 1);
            visited[i] = false;
        }
    }

} // end of class
