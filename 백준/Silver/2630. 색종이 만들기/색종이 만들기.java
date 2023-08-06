import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] res = new int[3];

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        int[][] paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        paperCut(paper, 0, 0, N);

        bw.write(res[0] + "\n");
        bw.write(res[1] + "\n");

        bw.close();
        br.close();
    }

    public static void paperCut(int[][] paper, int row, int col, int size) {
        // 제일 작은 단위 정사각형
        if (isSameColor(paper, row, col, size)) {
            res[paper[row][col]]++;
        } else {
            int reSize = size / 2;
            paperCut(paper, row, col, reSize);
            paperCut(paper, row, col + reSize, reSize);
            paperCut(paper, row + reSize, col, reSize);
            paperCut(paper, row + reSize, col + reSize, reSize);
        }
    }

    public static boolean isSameColor(int[][] paper, int row, int col, int size) {
        int color = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}