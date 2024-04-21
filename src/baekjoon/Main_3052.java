package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_3052 {

    static int[] A = new int[42];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=1; i<=10; i++) {
            int N = Integer.parseInt(br.readLine());

            int nmg = N % 42;

            A[nmg] += 1;
        }// for

        int count = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] >= 1) count ++;
        }// for

        bw.write(count + "");
        bw.flush();
        bw.close();
    }// main

}
