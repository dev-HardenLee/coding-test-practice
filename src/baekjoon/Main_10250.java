package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10250 {

    static int T;

    static int H;

    static int W;

    static int N;

    static int[][] A;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine(), " ");

            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            A = new int[H + 1][W + 1];

            int h = 0;
            int w = 0;

            int count = 0;

            Loop1:
            for (int i = 0; i < W; i++) {
                for (int j = 0; j < H; j++) {
                    count ++;

                    if(count == N) {
                        h = j + 1;
                        w = i + 1;

                        break Loop1;
                    }// if
                }// for
            }// for

            bw.write(h + (w < 10 ? "0" + w : "" + w) + "\n");
        }// for

        bw.flush();
        bw.close();
    }// main

}// Main_10250












