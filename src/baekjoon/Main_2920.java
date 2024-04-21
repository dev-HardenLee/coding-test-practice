package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2920 {

    static int [] A = new int[8];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<8; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }// for

        boolean isAscending = true;
        boolean isDescending = true;

        for(int i=1; i<8; i++) {
            if(A[i - 1] > A[i]) {
                isAscending = false;

                break;
            }// if
        }// for

        for(int i=1; i<8; i++) {
            if(A[i - 1] < A[i]) {
                isDescending = false;

                break;
            }// if
        }// for

        if(isAscending) bw.write("ascending");
        else if(isDescending) bw.write("descending");
        else bw.write("mixed");

        bw.flush();
        bw.close();
    }// main

}
