import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String args[]) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(br.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        solveByBFS(map, N, M);
        bw.write(map[N - 1][M - 1] + "\n");

        bw.close();
        br.close();
    }

    public static void solveByBFS(int[][] map, int N, int M) {
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>() {{
            add(new int[]{0, 0});
        }};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currX = current[0], currY = current[1];

            if (!visited[currX][currY]) {
                visited[currX][currY] = true;

                for (int i = 0; i < 4; i++) {
                    int nextX = currX + dx[i];
                    int nextY = currY + dy[i];

                    if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                        continue;
                    if (visited[nextX][nextY] || map[nextX][nextY] == 0)
                        continue;

                    queue.add(new int[] {nextX, nextY});
                    map[nextX][nextY] = map[currX][currY] + 1;
                }
            }
        }
    }
}