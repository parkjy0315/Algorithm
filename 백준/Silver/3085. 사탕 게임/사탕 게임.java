import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static char[][] board;
    private static int[][] position = {{1, 0}, {0, 1}};
    private static int maxCount = 0;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            char[] row = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                board[i][j] = row[j];
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                for (int k = 0; k < position.length; k++) {
                    int i2 = i + position[k][0];
                    int j2 = j + position[k][1];

                    changePos(i, j, i2, j2);
                    computeMaxCandy();
                    changePos(i, j, i2, j2);
                }
            }
        }
        int i = N - 1;
        int j = N - 1;
        for (int k = 0; k < position.length; k++) {
            int i2 = i - position[k][0];
            int j2 = j - position[k][1];

            changePos(i, j, i2, j2);
            computeMaxCandy();
            changePos(i, j, i2, j2);
        }

        bw.write(maxCount + "\n");

        bw.close();
        br.close();
    }

    public static void changePos(int i1, int j1, int i2, int j2) {
        char temp = board[i1][j1];
        board[i1][j1] = board[i2][j2];
        board[i2][j2] = temp;
    }

    public static void computeMaxCandy() {
        int count;

        for (int i = 0; i < N; i++) {
            count = 1;
            char cColor = board[i][0];
            for (int j = 1; j < N; j++) {
                if (cColor == board[i][j]) {
                    count++;
                } else {
                    count = 1;
                    cColor = board[i][j];
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        for (int i = 0; i < N; i++) {
            count = 1;
            char cColor = board[0][i];
            for (int j = 1; j < N; j++) {
                if (cColor == board[j][i]) {
                    count++;
                } else {
                    count = 1;
                    cColor = board[j][i];
                }

                maxCount = Math.max(maxCount, count);
            }
        }
    }
}