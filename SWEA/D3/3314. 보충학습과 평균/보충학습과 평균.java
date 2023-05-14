import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            // 입력 처리
            int [] scoreArr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int i=0; i< scoreArr.length; i++) {
                int score = scoreArr[i];
                if (score < 40) {
                    scoreArr[i] = 40;
                }
            }

            System.out.println((int)Arrays.stream(scoreArr).average().getAsDouble());
        }
    }
}

