package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2562 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = 0;
        int maxIndex = 0;

        for(int i=0; i<9; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n > maxNum) {
                maxNum = n;
                maxIndex = i + 1;
            }// if
        }// for

        bw.write(maxNum + "\n");
        bw.write(maxIndex + "");
        bw.flush();
        bw.close();
    }// main

}// Main_2562
