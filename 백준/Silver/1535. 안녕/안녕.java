import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;

    private static int health = 100;
    private static int joyful = 0;
    private static int[] L;
    private static int[] J;

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        L = new int[N + 1];
        J = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            J[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N + 1][101];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < 100; j++) {
                if (L[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - L[i]] + J[i]);
                }
            }
        }

        bw.write(dp[N][99] + "\n");

        bw.close();
        br.close();
    }
}