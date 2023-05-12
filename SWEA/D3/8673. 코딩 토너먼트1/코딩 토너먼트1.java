import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            int K = Integer.parseInt(br.readLine()) - 1;
            int[] value = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = 0;
            int total = (int) Math.pow(2, K);
            while (total != 0) {
                for (int i = 0; i < total; i++) {
                    int index = i * 2;
                    sum += Math.abs(value[index] - value[index + 1]);
                    value[i] = Math.max(value[index], value[index + 1]);
                }
                total = (int) Math.pow(2, --K);
            }

            System.out.println(sum);
        }
    }
}