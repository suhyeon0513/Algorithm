import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> set1 = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            set1.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> set2 = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) {
            set2.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;
        for (int i : set1) {
            if(!set2.contains(i)){
                cnt++;
            }
        }

        for (int i : set2) {
            if(!set1.contains(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    } // end of main

} // end of class
