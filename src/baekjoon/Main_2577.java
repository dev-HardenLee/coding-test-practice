package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2577 {

    static int[] numCnt = new int[10];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 1;

        for(int i=0; i<3; i++) {
            n *= Integer.parseInt(br.readLine());
        }// for

        String str = String.valueOf(n);

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            numCnt[(ch - '0')] += 1;
        }// for

        for(int i=0; i<numCnt.length; i++) {
            bw.write(numCnt[i] + "\n");
        }// for

        bw.flush();
        bw.close();
    }// main

}
