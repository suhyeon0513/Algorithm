import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        BigInteger res = new BigInteger("0");
        for (int i = 0; i < N; i++) {
            res = res.add(BigInteger.valueOf(s.charAt(i) - 'a' + 1).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.println(res.remainder(BigInteger.valueOf(1234567891)));

    } // end of main

} // end of class
