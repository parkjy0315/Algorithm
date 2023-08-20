import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[1] = 1;

        for (int i = 1; i <= N; i++) {
            // 모든 경우는 1로 만들 수 있음
            dp[i] = i;

            for (int j = 1; j * j <= i; j++) {
                // [i]번째의 항과 [i - j * j]번쨰항 + 1 중 더 작은값으로 최적화
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        bw.write(dp[N] + "\n");

        bw.close();
        br.close();
    }
}