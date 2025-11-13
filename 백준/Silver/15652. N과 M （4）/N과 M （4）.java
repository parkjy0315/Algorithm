import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringBuilder sb = new StringBuilder();
    static int[] numArray;
    static int N, M;

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        numArray = new int[M];

        backtrack(1, 0);

        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    public static void backtrack(int start, int depth) throws Exception {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numArray[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            numArray[depth] = i;
            backtrack(i, depth + 1);
        }
    }
}