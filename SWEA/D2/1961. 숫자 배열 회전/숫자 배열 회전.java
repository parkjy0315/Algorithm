import java.io.*;

class Solution {
    public static String[][] rotate(String[][] matrix, int N) {
        String[][] result = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = matrix[N - j - 1][i];
            }
        }
        return result;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            bw.write(String.format("#%d\n", test));

            int N = Integer.parseInt(br.readLine());
            String[][] matrix = new String[N][N];
            for (int i = 0; i < N; i++) {
                matrix[i] = br.readLine().split(" ");
            }

            String[][] res1 = rotate(matrix, N);
            String[][] res2 = rotate(res1, N);
            String[][] res3 = rotate(res2, N);

            for (int i = 0; i < N; i++) {
                String temp1 = "";
                String temp2 = "";
                String temp3 = "";
                for (int j = 0; j < N; j++) {
                    temp1 += res1[i][j];
                    temp2 += res2[i][j];
                    temp3 += res3[i][j];
                }
                bw.write(temp1 + " " + temp2 + " " + temp3 + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
