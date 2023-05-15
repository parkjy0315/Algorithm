
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dateArr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int month1 = Integer.parseInt(st.nextToken());
            int date1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int date2 = Integer.parseInt(st.nextToken());

            int totalDate1 = date1;
            int totalDate2 = date2;
            for (int i = 1; i < month1; i++) {
                totalDate1 += dateArr[i];
            }
            for (int i = 1; i < month2; i++) {
                totalDate2 += dateArr[i];
            }

            int diff = totalDate2 - totalDate1 + 1;
            System.out.printf("#%d %d\n", test, diff);
        }
    }
}

