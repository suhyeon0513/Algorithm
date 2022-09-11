import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Person{
        int weight;
        int height;
        int rank;

        public Person(int weight, int height, int rank) {
            this.weight = weight;
            this.height = height;
            this.rank = rank;
        }
    }

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Person[] arr = new Person[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), N);
        }

        for (int i = 0; i < N; i++) {
            int r = 1;
            for (int j = 0; j < N; j++) {
                if(i==j) continue;
                if(arr[i].weight < arr[j].weight && arr[i].height < arr[j].height){
                    r++;
                }
            }
            System.out.print(r + " ");
        }

    } // end of main

} // end of class
