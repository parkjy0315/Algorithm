import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int T;
    private static int I;
    private static int[] start;
    private static int[] end;
    private static int[][] directions = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            I = Integer.parseInt(br.readLine());
            start = new int[2];
            end = new int[2];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i=0; i<2; i++) {
                start[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            for (int i=0; i<2; i++) {
                end[i] = Integer.parseInt(st.nextToken());
            }

            bw.write(bfs() + "\n");
        }

        bw.close();
        br.close();
    }

    public static boolean isValid(int i, int j) {
        return 0 <= i && i < I && 0 <= j && j < I;
    }

    public static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[I][I];
        queue.offer(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == end[0] && current[1] == end[1]) {
                return current[2];
            }

            for (int[] dir : directions) {
                int nX = current[0] + dir[0];
                int nY = current[1] + dir[1];

                if (isValid(nX, nY) && !visited[nX][nY]) {
                    queue.offer(new int[]{nX, nY, current[2] + 1});
                    visited[nX][nY] = true;
                }
            }
        }

        return 0;
    }
}