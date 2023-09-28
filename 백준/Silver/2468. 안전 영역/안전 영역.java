import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private static int N;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        int[][] area = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxCount = 1;
        for (int height = 0; height <= 100; height++) {
            boolean[][] visited = new boolean[N][N];
            Queue<int[]> queue = new LinkedList<>();
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && area[i][j] > height) {
                        queue.offer(new int[]{i, j});
                        visited[i][j] = true;

                        while (!queue.isEmpty()) {
                            int[] current = queue.poll();

                            for (int[] direction : directions) {
                                int nX = current[0] + direction[0];
                                int nY = current[1] + direction[1];

                                if (isValid(nX, nY) && !visited[nX][nY] && area[nX][nY] > height) {
                                    queue.offer(new int[]{nX, nY});
                                    visited[nX][nY] = true;
                                }
                            }
                        }

                        count++;
                    }
                }
            }

            maxCount = Math.max(maxCount, count);
        }

        bw.write(maxCount + "\n");

        bw.close();
        br.close();
    }

    public static boolean isValid(int i, int j) {
        return 0 <= i && i < N && 0 <= j && j < N;
    }
}