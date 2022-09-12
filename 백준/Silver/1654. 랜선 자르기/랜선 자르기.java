import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        long N = Integer.parseInt(st.nextToken());


        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long min = 0;
        long max = Arrays.stream(arr).max().getAsLong()+1;
        long mid = 0;

        while (min < max) {

            long cnt = 0;

            mid = (min + max) / 2;

            for (int i = 0; i < K; i++) {
                cnt += (arr[i] / mid);
            }

            if (cnt < N) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);

    } // end of main

} // end of class
