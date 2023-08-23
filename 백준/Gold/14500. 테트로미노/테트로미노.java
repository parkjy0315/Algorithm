import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int[][] board;
    private static boolean[][] visited;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 종이판 입력
        board = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(new State(i, j, 1, board[i][j]));
                visited[i][j] = false;
            }
        }

        bw.write(max + "\n");

        bw.close();
        br.close();
    }

    public static void dfs(State currState) {
        if (currState.count == 4) {
            max = Math.max(max, currState.total);
            return;
        }

        for (int k = 0; k < 4; k++) {
            int nextX = currState.x + dx[k];
            int nextY = currState.y + dy[k];

            if (0 <= nextX && nextX < N && 0 <= nextY && nextY < M) {
                if (!visited[nextX][nextY]) {
                    if (currState.count == 2) {
                        visited[nextX][nextY] = true;
                        dfs(new State(currState.x, currState.y, currState.count + 1, currState.total + board[nextX][nextY]));
                        visited[nextX][nextY] = false;
                    }

                    visited[nextX][nextY] = true;
                    dfs(new State(nextX, nextY, currState.count + 1, currState.total + board[nextX][nextY]));
                    visited[nextX][nextY] = false;
                }
            }
        }
    }
}

class State {
    int x;
    int y;
    int count;
    int total;

    public State(int x, int y, int count, int total) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.total = total;
    }
}