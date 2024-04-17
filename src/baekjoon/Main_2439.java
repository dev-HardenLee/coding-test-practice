package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2439 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int j = n;

            for(; j>i+1; j--) {
                sb.append(" ");
            }// for

            for(int r=1; r<=j; r++) {
                sb.append("*");
            }// for
            sb.append("\n");
        }// for

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }// main

}
