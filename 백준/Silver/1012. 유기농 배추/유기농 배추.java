import java.io.*;
import java.util.*;

class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int T = Integer.parseInt(br.readLine());

        for (int test = 0; test < T; test++) {
            String[] infos = br.readLine().split(" ");
            int M = Integer.parseInt(infos[0]);
            int N = Integer.parseInt(infos[1]);
            int K = Integer.parseInt(infos[2]);

            int[][] map = new int[N][M];

            for (int i = 0; i < K; i++) {
                int[] pos = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                map[pos[1]][pos[0]] = 1;
            }

            Queue<int[]> queue = new LinkedList<>();
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 지도의 좌표 값이 배추인 경우
                    if (map[i][j] != 0) {
                        // 큐에 현재 배추 좌표 add
                        queue.add(new int[]{i, j});
                        map[i][j] = 0;

                        while (!queue.isEmpty()) {
                            int[] curr = queue.poll();
                            int currX = curr[0];
                            int currY = curr[1];

                            for (int k = 0; k < 4; k++) {
                                int newX = currX + dx[k];
                                int newY = currY + dy[k];

                                if (0 <= newX && newX < N && 0 <= newY && newY < M ) {
                                    if (map[newX][newY] != 0) {
                                        queue.add(new int[]{newX, newY});
                                        map[newX][newY] = 0;
                                    }
                                }
                            }
                        }

                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        bw.close();
        br.close();
    }
}