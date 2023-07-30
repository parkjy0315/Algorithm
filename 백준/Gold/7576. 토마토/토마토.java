import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        int[][] box = new int[N][M];
        int ripe = 0, empty = 0;

        for (int i = 0; i < N; i++) {
            // 1: 익은 토마토, 0: 안익은 토마토, -1: 빈 칸
            box[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < M; j++) {
                switch (box[i][j]) {
                    case 1:
                        ripe++;
                        break;
                    case -1:
                        empty++;
                        break;
                }
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int dayCount = 0;

        // 모든 토마토가 익은 상태
        if (ripe == N * M - empty) {
            bw.write("0\n");
        } else {
            Queue<int[]> ripeQueue = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 익은 토마토
                    if (box[i][j] == 1) {
                        ripeQueue.add(new int[]{i, j});
                    }
                }
            }

            while (true) {
                // 모두 익을 수 있는 상황
                if (ripe == N * M - empty) {
                    bw.write(dayCount + "\n");
                    break;
                }

                int changeCnt = 0;
                int size = ripeQueue.size();

                for (int i = 0; i < size; i++) {
                    int[] curr = ripeQueue.poll();
                    int currX = curr[0];
                    int currY = curr[1];

                    for (int k = 0; k < 4; k++) {
                        int newX = currX + dx[k];
                        int newY = currY + dy[k];

                        // 좌표 범위 검사
                        if (0 <= newX && newX < N && 0 <= newY && newY < M) {
                            // 상자 항목 검사
                            if (box[newX][newY] == 0) {
                                ripeQueue.add(new int[]{newX, newY});
                                box[newX][newY] = 1;
                                changeCnt++;
                                ripe++;
                            }
                        }
                    }
                }

                dayCount++;

                // 모두 익지 못하는 상황
                if (changeCnt == 0) {
                    bw.write("-1\n");
                    break;
                }
            }

        }

        bw.close();
        br.close();
    }
}