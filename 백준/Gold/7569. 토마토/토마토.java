import java.io.*;
import java.util.*;

class Position {
    int x;
    int y;
    int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;
    private static int H;
    private static int[] dx = {-1, 1, 0, 0, 0, 0};
    private static int[] dy = {0, 0, -1, 1, 0, 0};
    private static int[] dz = {0, 0, 0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        int[][][] storage = new int[H][N][M];
        int ripe = 0, empty = 0;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    storage[i][j][k] = Integer.parseInt(st.nextToken());
                    if (storage[i][j][k] == -1) {
                        empty++;
                    } else if (storage[i][j][k] == 1) {
                        ripe++;
                    }
                }
            }
        }


        bw.write(tomato(storage, ripe, empty) + "\n");

        bw.close();
        br.close();
    }

    public static int tomato(int[][][] storage, int ripe, int empty) {
        Queue<Position> queue = new LinkedList<>();
        int ripeMax = N * M * H - empty;
        int dayCount = -1;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (storage[i][j][k] == 1) {
                        queue.add(new Position(i, j, k));
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i=0; i<size; i++) {
                Position pos = queue.poll();
                int currX = pos.x;
                int currY = pos.y;
                int currZ = pos.z;

                for (int j = 0; j < 6; j++) {
                    int nextX = currX + dx[j];
                    int nextY = currY + dy[j];
                    int nextZ = currZ + dz[j];

                    if (0 <= nextX && nextX < H &&
                            0 <= nextY && nextY < N &&
                            0 <= nextZ && nextZ < M) {
                        if (storage[nextX][nextY][nextZ] == 0) {
                            queue.add(new Position(nextX, nextY, nextZ));
                            storage[nextX][nextY][nextZ] = 1;
                            ripe++;
                        }
                    }
                }
            }

            dayCount++;
        }


        if (ripeMax != ripe) {
            dayCount = -1;
        }

        return dayCount;
    }
}

