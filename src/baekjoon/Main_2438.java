package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2438 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            for(int j=1; j<=i+1; j++) {
                sb.append("*");
            }// for
            sb.append("\n");
        }// for

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }// main

}// Main_2438
