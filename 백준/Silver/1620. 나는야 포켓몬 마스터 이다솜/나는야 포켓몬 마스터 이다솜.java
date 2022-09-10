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

        ArrayList<String> list = new ArrayList<>();
        list.add("");
        Map<String, String> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, String.valueOf(i));
            list.add(name);
        }

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
                if(map.containsKey(s)){
                    sb.append(map.get(s)).append("\n");
                }
            } else{
                sb.append(list.get(Integer.parseInt(s))).append("\n");
            }
        }
        System.out.println(sb);
    } // end of main

} // end of class
