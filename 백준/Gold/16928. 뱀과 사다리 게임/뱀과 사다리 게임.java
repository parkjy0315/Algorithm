import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;
    private static int[] map = new int[101];
    private static boolean[] visited = new boolean[101];
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int source = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());

            map[source] = dest;
        }

        bfs();

        bw.write(min + "\n");

        bw.close();
        br.close();
    }

    public static void bfs() {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(1, 0));

        while (!queue.isEmpty()) {
            State current = queue.poll();
            if (current.pos == 100) {
                min = Math.min(min, current.count);
            }

            loop:
            for (int i = 1; i <= 6; i++) {
                int nextPos = current.pos + i;

                // 게임판 내 범위 인지
                if (1 < nextPos && nextPos < 101) {
                    if (!visited[nextPos]) {
                        while (map[nextPos] != 0) {
                            visited[nextPos] = true;
                            nextPos = map[nextPos];
                        }

                        visited[nextPos] = true;
                        queue.add(new State(nextPos, current.count + 1));
                    }
                }
            }
        }
    }
}

class State {
    int pos;
    int count;

    public State(int pos, int count) {
        this.pos = pos;
        this.count = count;
    }
}