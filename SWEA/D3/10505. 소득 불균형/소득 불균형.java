import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            int N = Integer.parseInt(br.readLine());
            int [] incomeArr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            double avg = Arrays.stream(incomeArr).average().getAsDouble();
            int count = 0;
            for(int income : incomeArr) {
                if (income <= avg)
                    count++;
            }

            System.out.println(count);
        }
    }
}
