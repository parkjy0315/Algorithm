import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] visited = new int[100001];

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        // 이동하는 방법 (X - 1, X + 1, X * 2)
        // 위치 좌표 큐
        Queue<Integer> queue = new LinkedList<>() {{ add(N); }};
        int index = N;
        visited[index] = 1;

        while (!queue.isEmpty()) {
            int cPos = queue.poll();

            if (cPos == K) {
                break;
            }

            int[] var = {-1, 1, cPos};

            for (int i = 0; i < var.length; i++) {
                int nPos = cPos + var[i];
                if (0 <= nPos && nPos <= 100000 && visited[nPos] == 0) {
                    visited[nPos] = visited[cPos] + 1;
                    queue.add(nPos);
                }
            }
        }

        bw.write(visited[K] - 1 + "\n");

        bw.close();
        br.close();
    }
}