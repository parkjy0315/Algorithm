import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int normalCount = normalCount(map);
        int colorWeakCount = weakCount(map);

        bw.write(normalCount + " " + colorWeakCount + "\n");

        bw.close();
        br.close();
    }

    public static int normalCount(char[][] map) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    char color = map[i][j];

                    queue.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();

                        for (int k = 0; k < 4; k++) {
                            int nextX = current[0] + dx[k];
                            int nextY = current[1] + dy[k];

                            if ((0 <= nextX && nextX < N) && (0 <= nextY && nextY < N)) {
                                if (!visited[nextX][nextY] && color == map[nextX][nextY]) {
                                    queue.add(new int[]{nextX, nextY});
                                    visited[nextX][nextY] = true;
                                }
                            }
                        }
                    }

                    count++;
                }
            }
        }

        return count;
    }

    public static int weakCount(char[][] map) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    char color = map[i][j];

                    queue.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();

                        for (int k = 0; k < 4; k++) {
                            int nextX = current[0] + dx[k];
                            int nextY = current[1] + dy[k];

                            if ((0 <= nextX && nextX < N) && (0 <= nextY && nextY < N)) {
                                if (!visited[nextX][nextY]) {
                                    if ((color == 'B' && color == map[nextX][nextY]) ||
                                        ((color == 'G' || color == 'R') &&
                                        (map[nextX][nextY] == 'G' || map[nextX][nextY] == 'R'))) {
                                        queue.add(new int[]{nextX, nextY});
                                        visited[nextX][nextY] = true;
                                    }
                                }
                            }
                        }
                    }

                    count++;
                }
            }
        }

        return count;
    }

}
