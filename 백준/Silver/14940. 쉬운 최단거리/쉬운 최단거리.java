import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    private static int m;
    private static int[][] map;
    private static int[][] distance;
    private static boolean[][] visited;
    private final static int[] dx = {0, 0, -1, 1};
    private final static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        distance = new int[n][m];
        visited = new boolean[n][m];
        int startX = -1, startY = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (startX == -1 && map[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
            }
        }

        bfs(startX, startY);

        for (int i = 0; i < n; i++) {
            for (int j=0; j<m; j++) {
                if (map[i][j] == 1 && !visited[i][j])
                    bw.write(-1 + " ");
                else
                    bw.write(distance[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }

    public static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (0 <= nextX && nextX < n && 0 <= nextY && nextY < m) {
                    if (map[nextX][nextY] != 0 && !visited[nextX][nextY]) {
                        queue.add(new int[]{nextX, nextY});
                        distance[nextX][nextY] = distance[curX][curY] + 1;
                        visited[nextX][nextY] = true;
                    }
                }
            }
        }
    }
}