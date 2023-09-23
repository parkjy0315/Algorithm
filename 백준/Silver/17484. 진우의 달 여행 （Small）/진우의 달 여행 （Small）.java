import java.io.*;
import java.util.*;

class State {
    int row;
    int col;
    int fuel;
    int dir;

    public State(int row, int col, int fuel, int dir) {
        this.row = row;
        this.col = col;
        this.fuel = fuel;
        this.dir = dir;
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;
    private static int[][] directions = {{1, -1}, {1, 0}, {1, 1}};

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 움직일 수 있는 방향 3가지
        // 전에 움직인 방향으로 이동 불가능(두번 연속)
        // 연료를 최대한 아껴서 지구에 어느 위치든 출발해 어느 위치든 착륙

        // # 시작 위치는 M가지 중 하나에서 시작
        // 1. 3가지 방향에 대해 탐색
        // 2. 각 방향으로 이동시 이동했던 방향을 제외하고 탐색
        // 3. dp 활용
        int[][] space = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                space[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<State> queue = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            queue.add(new State(0, i, space[0][i], -1));
        }

        int minFuel = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.row == N - 1) {
                minFuel = Math.min(minFuel, current.fuel);
                continue;
            }

            for (int i = 0; i < directions.length; i++) {
                if (current.dir == i) {
                    continue;
                }

                int nRow = current.row + directions[i][0];
                int nCol = current.col + directions[i][1];

                if (0 <= nRow && nRow < N && 0 <= nCol && nCol < M) {
                    queue.add(new State(nRow, nCol, space[nRow][nCol] + current.fuel, i));
                }
            }
        }

        bw.write(minFuel + "\n");

        bw.close();
        br.close();
    }
}