import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            int angle = Integer.parseInt(br.readLine());

            int hour = 0;
            int minute = angle * 2;
            if (minute >= 60) {
                hour = minute / 60;
                minute %= 60;
            }
            
            System.out.println(hour + " " + minute);
        }
    }
}

