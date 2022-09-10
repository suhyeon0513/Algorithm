import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set1.add(br.readLine());
        }
        Set<String> set2 = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            set2.add(br.readLine());
        }

        int cnt = 0;
        for(String a : set2){
            if(set1.contains(a)){
                cnt++;
                sb.append(a).append("\n");
            }
        }

        System.out.println(cnt);
        System.out.println(sb);

    } // end of main

} // end of class
