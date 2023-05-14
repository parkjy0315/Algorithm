import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            // 입력
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];
            for (int i = 0; i < N; i++) {
                map[i] = Arrays.stream(br.readLine().split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            int total = 0;
            int mid = N / 2;
            for (int i = 0; i < mid; i++) {
                int start = mid - i;
                int end = mid + i;
                for (int j = start; j <= end; j++)
                    total += map[i][j];
                for (int j = start; j <= end; j++)
                    total += map[N - i - 1][j];
            }
            for(int i=0; i<N; i++)
                total += map[mid][i];

            System.out.printf("#%d ", test);
            System.out.println(total);
        }
    }
}

