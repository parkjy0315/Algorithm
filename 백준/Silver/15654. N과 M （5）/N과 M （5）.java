import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringBuilder sb = new StringBuilder();
    static int[] numArray;
    static boolean[] visited;
    static int[] outputArray;
    static int N, M;

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        numArray = new int[N];
        visited = new boolean[N];
        outputArray = new int[M];

        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            numArray[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numArray, 0, N);

        backtrack(0, 0);

        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    public static void backtrack(int startIndex, int depth) throws Exception {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(outputArray[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = startIndex; i < N; i++) {
            if (visited[i]) {
                continue;
            }

            outputArray[depth] = numArray[i];
            visited[i] = true;
            backtrack(0, depth + 1);
            visited[i] = false;
        }
    }
}