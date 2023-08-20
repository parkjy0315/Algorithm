import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;
    private static int[][] relations;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        relations = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            Arrays.fill(relations[i], 1_000_000);
            relations[i][i] = 0;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u1 = Integer.parseInt(st.nextToken());
            int u2 = Integer.parseInt(st.nextToken());

            relations[u1][u2] = 1;
            relations[u2][u1] = 1;
        }

        floyd();

        int min = Integer.MAX_VALUE;
        int user = 0;

        for (int i = 1; i <= N; i++) {
            int sum = 0;

            for (int j = 1; j <= N; j++) {
                if (relations[i][j] != 1_000_000) {
                    sum += relations[i][j];
                }
            }

            if (min > sum) {
                min = sum;
                user = i;
            }
        }

        bw.write(user + "\n");

        bw.close();
        br.close();
    }

    public static void floyd() {
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    relations[i][j] = Math.min(relations[i][j], relations[i][k] + relations[k][j]);
                }
            }
        }
    }
}