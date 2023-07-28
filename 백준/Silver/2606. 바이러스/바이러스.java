import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception {
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] network = new int[N][N];

        for (int i = 0; i < M; i++) {
            int[] connected = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int x = connected[0];
            int y = connected[1];

            network[x - 1][y - 1] = network[y - 1][x - 1] = 1;
        }

        int computer = calcInfectedNum(network, N);
        bw.write(computer + "\n");

        bw.close();
        br.close();
    }

    public static int calcInfectedNum(int[][] network, int N) {
        Queue<Integer> queue = new LinkedList<>() {{ add(0); }};
        boolean[] visited = new boolean[N];
        int computer = -1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (!visited[current]) {
                visited[current] = true;
                computer++;

                for (int i=0; i<N; i++) {
                    if (!visited[i] && network[current][i] == 1) {
                        queue.add(i);
                    }
                }
            }
        }

        return computer;
    }
}