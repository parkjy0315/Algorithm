import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());

        int[] stairs = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = stairs[1];

        if (N >= 2) {
            dp[2] = stairs[2] + dp[1];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2],  dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        bw.write(dp[N] + "\n");

        bw.close();
        br.close();
    }
}