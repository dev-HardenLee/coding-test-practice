package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_11720 {

    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }// for

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }// main

}// Main_11720
