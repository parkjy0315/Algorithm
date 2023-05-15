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
            bw.write(String.format("#%d ", test));

            String[] wordArr = br.readLine().split(" ");

            for (String word : wordArr) {
                bw.write((char)(word.charAt(0) - 32));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
