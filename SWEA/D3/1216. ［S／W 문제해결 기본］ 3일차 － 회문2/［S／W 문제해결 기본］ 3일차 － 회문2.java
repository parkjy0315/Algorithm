
import java.io.*;
import java.util.*;

class Solution {
    public static boolean solve(char[][] table, int len) {
        for (int i = 0; i < 100; i++) {
            for (int j=0; j<= (100 - len); j++) {
                if (solveRow(table, i, j, len) || solveCol(table, j, i, len)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solveRow(char[][] table, int i, int j, int len) {
        for (int k = 0; k < len / 2; k++) {
            if (table[i][j + k] != table[i][j + len - 1 - k])
                return false;
        }
        return true;
    }

    public static boolean solveCol(char[][] table, int i, int j, int len) {
        for (int k = 0; k < len / 2; k++) {
            if (table[i + k][j] != table[i + len - 1 - k][j])
                return false;
        }
        return true;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int test = 1; test <= 10; test++) {
            int T = Integer.parseInt(br.readLine());
            char[][] table = new char[100][100];
            for (int i = 0; i < table.length; i++) {
                table[i] = br.readLine().toCharArray();
            }

            bw.write(String.format("#%d ", test));
            for (int len = 100; len > 0; len--) {
                if (solve(table, len)) {
                    bw.write(len + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

