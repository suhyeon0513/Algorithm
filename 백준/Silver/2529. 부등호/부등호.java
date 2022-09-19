import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int N, R;
    static int[] arr;
    static boolean[] isSelected;
    static int[] numbers;
    static int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static ArrayList<String> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N * 2 + 1];

        String s = br.readLine();
        for (int i = 1; i <= s.length(); i++) {
            arr[i] = s.charAt(i - 1);
        }

        R = N + 1;
        
        numbers = new int[N + 1];
        isSelected = new boolean[10];
        
        perm(0);


        Collections.sort(list);

        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));



    }

    private static void perm(int cnt) { // cnt+1번째 해당하는 순열에 포함될 수를 뽑기
        // 기저 조건
        if (cnt == R) {
            int idx = 0;
            for (int i = 0; i < R; i++) {
                arr[idx] = numbers[i];
                idx += 2;
            }

            boolean flag = true;
            for (int i = 1; i < arr.length; i += 2) {
                if (arr[i] == 60) {  // 60 == '<'
                    if (arr[i - 1] >= arr[i + 1]) {
                        flag = false;
                        break;
                    }
                } else if (arr[i] == 62) {  // 62 == '>'
                    if (arr[i - 1] <= arr[i + 1]){
                        flag = false;
                        break;
                    }
                }
            }

            String num = "";
            for (int a : numbers) {
                num += a;
            }


            if (flag)
                list.add(num);

            return;
        }

        for (int i = 0; i < 10; i++) { // 선택지
            if (isSelected[i])
                continue;

            numbers[cnt] = input[i];
            isSelected[i] = true;
            // 다음 수 뽑으러 가기
            perm(cnt + 1);
            isSelected[i] = false;
        }
    }
}