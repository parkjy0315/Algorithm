import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;

    public static void main(String[] args) throws Exception {
        n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 5];
        Arrays.fill(dp, 123_456_789);
        dp[2] = dp[5] = 1;
        dp[4] = 2;

        for (int i = 6; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                int part1 = dp[j];
                int part2 = dp[i - j];

                dp[i] = Math.min(dp[i], part1 + part2);
            }
        }
        if (dp[n] == 123_456_789) {
            bw.write("-1");
        } else {
            bw.write(dp[n] + "\n");
        }

        bw.close();
        br.close();
    }
}