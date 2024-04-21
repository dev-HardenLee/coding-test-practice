package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_8958 {

    static int T;

    static int[] DP;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            DP = new int[str.length() + 1];

            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);

                if(ch == 'O') {
                    DP[j + 1] = DP[j] + 1;
                }else if(ch == 'X'){
                    DP[j + 1] = 0;
                }// if-else
            }// for

            int sum = 0;

            for(int k=1; k<DP.length; k++) sum += DP[k];

            bw.write(sum + "\n");
        }// for

        bw.flush();
        bw.close();
    }// main

}// Main_8958
