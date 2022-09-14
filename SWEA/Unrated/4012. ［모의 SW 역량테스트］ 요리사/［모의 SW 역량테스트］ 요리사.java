import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static String s;
    static String[] string;
    static int T, N, sum1, sum2, min = Integer.MAX_VALUE;
    static int[] selected, unselected, in1, in2;
    static boolean[] isSelected;
    static int[][] S;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            N = Integer.parseInt(br.readLine());

            S = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    S[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            selected = new int[N / 2];
            unselected = new int[N / 2];

            comb(0, 0);

            sb.append("#").append(testCase).append(" ").append(min).append("\n");
            min = Integer.MAX_VALUE;
        }
        System.out.println(sb);
    }

    private static void comb(int cnt, int start) {

        isSelected = new boolean[N];

        if (cnt == N / 2) {
            for (int j = 0; j < N / 2; j++) {
                isSelected[selected[j]] = true;
            }
            int i = 0;
            for (int j = 0; j < N; j++) {
                if (!isSelected[j])
                    unselected[i++] = j;
            }

            in1 = new int[2];
            in2 = new int[2];

            sum1 = 0;
            sum2 = 0;

            min = Math.min(min, perm(0,0));

            return;
        }

        for (int i = start; i < N; i++) {
            selected[cnt] = i;
            comb(cnt + 1, i + 1);
        }
    }

    private static int perm(int cnt, int flag) {

        if (cnt == 2) {

            sum1 += S[in1[0]][in1[1]];
            sum2 += S[in2[0]][in2[1]];

            return Math.abs(sum1 - sum2);
        }

        for (int i = 0; i < N / 2; i++) {

            if ((flag & 1 << i) != 0)
                continue;

            in1[cnt] = selected[i];
            in2[cnt] = unselected[i];

            perm(cnt + 1, flag | (1 << i));

        }
        return Math.abs(sum1 - sum2);
    }


} // end of class
