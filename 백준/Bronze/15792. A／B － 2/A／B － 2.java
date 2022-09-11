import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());

        try {
            BigDecimal res = a.divide(b);
            System.out.println(res);
        } catch (ArithmeticException e) {
            BigDecimal res = a.divide(b, 2000, RoundingMode.HALF_UP);
            System.out.println(res);
        }


    } // end of main

} // end of class
