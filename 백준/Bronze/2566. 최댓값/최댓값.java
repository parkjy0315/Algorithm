import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int SIZE = 9;
    private static int max = Integer.MIN_VALUE;
    private static int maxRow;
    private static int maxCol;

    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(maxRow + " " + maxCol);

        bw.close();
        br.close();
    }
}