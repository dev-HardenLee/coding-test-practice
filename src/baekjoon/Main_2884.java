package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Main_2884 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        LocalDateTime ldt = LocalDateTime.of(2024, 04, 17, hour, minutes);

        ldt = ldt.minusMinutes(45L);

        String ldtFormat = ldt.format(DateTimeFormatter.ofPattern("HH mm"));

        st = new StringTokenizer(ldtFormat, " ");

        int resultHour = Integer.parseInt(st.nextToken());
        int resultMinutes = Integer.parseInt(st.nextToken());

        bw.write(resultHour + " " + resultMinutes + "");
        bw.flush();
        bw.close();
    }// main

}// Main_2884
