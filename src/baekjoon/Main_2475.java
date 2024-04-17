package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2475 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;

        for(int i=0; i<5; i++) {
            int n = Integer.parseInt(st.nextToken());

            sum += n * n;
        }// for

        int result = sum % 10;

        bw.write(result + "");

        bw.flush();
        bw.close();
    }// main

}
