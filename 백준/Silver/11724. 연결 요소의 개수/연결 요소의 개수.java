import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] matrix = new int[N][N];
        for (int i = 0; i < M; i++) {
            String[] vertex = br.readLine().split(" ");
            int start = Integer.parseInt(vertex[0]) - 1;
            int end = Integer.parseInt(vertex[1]) - 1;

            matrix[start][end] = matrix[end][start] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                queue.add(i);
                visited[i] = true;

                while (!queue.isEmpty()) {
                    int curr = queue.poll();

                    for (int j = 0; j < N; j++) {
                        if (matrix[curr][j] == 1 && !visited[j]) {
                            queue.add(j);
                            visited[j] = true;
                        }
                    }
                }
                count++;
            }
        }

        bw.write(count + "\n");

        bw.close();
        br.close();
    }
}