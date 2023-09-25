import java.util.*;

class Solution {
    private int COL = 4;
    private int ROW;

    int solution(int[][] land) {
        ROW = land.length;
        int[][] dp = new int[ROW][COL];
        for (int i = 0; i < COL; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                for (int k = 0; k < COL; k++) {
                    if (k == j) {
                        continue;
                    }

                    dp[i][j] = Math.max(dp[i][j], land[i][j] + dp[i - 1][k]);
                }
            }
        }

        return Arrays.stream(dp[ROW - 1]).max().getAsInt();
    }
}