package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1157 {

    public static int[] alphabet = new int[26];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        str = str.toUpperCase();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            alphabet[ch - 'A'] += 1;
        }// for

        int maxCnt = 0;
        int maxIndex = 0;

        for(int i=0; i<alphabet.length; i++) {
            if(alphabet[i] > maxCnt) {
                maxCnt = alphabet[i];
                maxIndex = i;
            }// if
        }// for

        char maxAlpha = (char) ((char) maxIndex + 'A');

        boolean isDuplicate = false;

        for(int i=0; i<alphabet.length; i++) {
            if(i == maxIndex) continue;

            if(alphabet[i] == maxCnt) {
                isDuplicate = true;

                break;
            }// if
        }// for

        bw.write((isDuplicate == true ? "?" : maxAlpha) + "");
        bw.flush();
        bw.close();
    }// main

}
