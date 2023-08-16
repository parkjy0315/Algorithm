import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static char[][] campus;
    private static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        campus = new char[N][M];
        visited = new boolean[N][M];
        int startX = -1, startY = -1;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            campus[i] = input.toCharArray();

            if (startX == -1) {
                for (int j = 0; j < M; j++) {
                    if (campus[i][j] == 'I') {
                        startX = i;
                        startY = j;
                        break;
                    }
                }
            }
        }

        int count = canMeetCount(startX, startY);
        if (count == 0) {
            bw.write( "TT\n");
        } else {
            bw.write(count + "\n");
        }


        bw.close();
        br.close();
    }

    public static int canMeetCount(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;

        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currX = current[0];
            int currY = current[1];

            for (int i = 0; i < 4; i++) {
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];

                if (0 <= nextX && nextX < N && 0 <= nextY && nextY < M) {
                    char next = campus[nextX][nextY];
                    if (next != 'X' && !visited[nextX][nextY]) {
                        if (next == 'P') {
                            count++;
                        }

                        queue.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
        }

        return count;
    }
}