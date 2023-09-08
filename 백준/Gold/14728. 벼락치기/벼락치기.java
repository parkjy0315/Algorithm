import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;
    private static int N;
    private static int T;
    private static int[] K;
    private static int[] S;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine(),  " ");
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        K = new int[N + 1];
        S = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            K[i] = Integer.parseInt(st.nextToken());
            S[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N + 1][T + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= T; j++) {
                if (K[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - K[i]] + S[i]);
                }
            }
        }

        bw.write(dp[N][T] + "\n");

        bw.close();
        br.close();
    }
}