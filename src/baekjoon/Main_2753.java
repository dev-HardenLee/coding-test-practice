package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2753 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if(n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
            bw.write("1");
        }else if(n % 4 == 0 && n % 100 == 0) {
            bw.write("0");
        }else if(n % 4 == 0) {
            bw.write("1");
        }else {
            bw.write("0");
        }// if-else

        bw.flush();
        bw.close();
    }

}// Main_2753
