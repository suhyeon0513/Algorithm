import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int len = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            len++;
            for (int j = 0; j <= s.length()-len; j++) {
                set.add(s.substring(j, j+len));
            }
        }

        System.out.println(set.size());


    } // end of main

} // end of class
