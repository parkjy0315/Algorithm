import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    private static int[][] dp = new int[11][11];

    public static int binomial(int n, int k) {
        if (dp[n][k] > 0)
            return dp[n][k];

        if (n == k || k == 0) {
            return dp[n][k] = 1;
        }

        return dp[n][k] = binomial(n-1, k-1) + binomial(n-1, k);
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(binomial(N, K)));

        bw.close();
        br.close();
    }
}