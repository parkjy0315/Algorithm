
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] map = new int[N][N];
            for (int i = 0; i < N; i++) {
                map[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            int count = 0;
            // 각 행 열에 대해서 연속된 1의 합이 K 값인 경우를 찾기
            for (int i = 0; i < N; i++) {
                int row = 0;
                int col = 0;
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 0) {
                        if (row == K)
                            count++;
                        row = 0;
                    }

                    if (map[j][i] == 0) {
                        if (col == K)
                            count++;
                        col = 0;
                    }

                    row += map[i][j];
                    col += map[j][i];
                }

                if (row == K)
                    count++;
                if (col == K)
                    count++;
            }

            System.out.printf("#%d %d\n", test, count);
        }
    }
}

