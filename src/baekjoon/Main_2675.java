package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2675 {

    static int T;

    static int R;

    static String S;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            sb = new StringBuilder();
            st = new StringTokenizer(br.readLine(), " ");

            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            for(int j=0; j<S.length(); j++) {
                char ch = S.charAt(j);

                for(int k=0; k<R; k++) {
                    sb.append(ch);
                }// for
            }// for

            bw.write(sb + "\n");
        }// for

        bw.flush();
        bw.close();
    }// main

}








