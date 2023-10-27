// 매직 스타는 1부터 12까지 숫자가 핵사그램에 채워져 있는 모양
// 한줄의 숫자 합은 26
// 일부만 채워진 매직스타가 주어졌을 때 전부를 채우는 프로그램 만들기

import java.io.*;
import java.util.*;
import java.util.zip.CheckedInputStream;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final int COL = 9;
    static final int ROW = 5;
    static final int TOTAL = 26;
    static char[][] star = new char[ROW][COL];
    static boolean[] visited = new boolean['L' - 'A' + 1];
    static List<int[]> spots = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // 매직 스타 모양 입력으로부터 매꿔야 하는 점 좌표들을 추출
        for (int i = 0; i < ROW; i++) {
            star[i] = br.readLine().toCharArray();
            for (int j = 0; j < COL; j++) {
                if (star[i][j] == 'x') {
                    spots.add(new int[]{i, j});
                } else if ('A' <= star[i][j] && star[i][j] <= 'L') {
                    visited[star[i][j] - 'A'] = true;
                }
            }
        }

        // dfs를 활용
        dfs(0);

        bw.close();
        br.close();
    }

    public static void dfs(int index) {
        // 특정 시점에서 조건을 모두 만족하면 더이상 반복하지 않아도 됨
        // 특정 시점 ? => 매꿔야하는 모든 점을 다 매꾼 시점!
        // 매꾸는 방법 어떻게 진행 ? => spots들을 반복문을 통해 접근 => 사용하지 않은 알파벳을 임의로 적용
        if (index == spots.size()) {
            if (check()) {
                for (int i=0; i<ROW; i++) {
                    for (int j=0; j<COL; j++) {
                        System.out.print(star[i][j]);
                    }
                    System.out.println();
                }
                System.exit(0);
            }
        }
        else {
            for (char ch = 'A'; ch <= 'L'; ch++) {
                if (!visited[ch - 'A']) {
                    int[] spot = spots.get(index);
                    star[spot[0]][spot[1]] = ch;
                    visited[ch - 'A'] = true;
                    dfs(index + 1);
                    visited[ch - 'A'] = false;
                    star[spot[0]][spot[1]] = 'x';
                }
            }
        }
    }

    public static boolean check() {
        return sum1() == TOTAL && sum2() == TOTAL &&
                sum3() == TOTAL && sum4() == TOTAL &&
                sum5() == TOTAL && sum6() == TOTAL;
    }

    public static int sum1() {
        return star[1][1] + star[1][3] + star[1][5] + star[1][7] - 4 * ('A' - 1);
    }

    public static int sum2() {
        return star[3][1] + star[3][3] + star[3][5] + star[3][7] - 4 * ('A' - 1);
    }

    public static int sum3() {
        return star[0][4] + star[1][3] + star[2][2] + star[3][1] - 4 * ('A' - 1);
    }

    public static int sum4() {
        return star[1][7] + star[2][6] + star[3][5] + star[4][4] - 4 * ('A' - 1);
    }

    public static int sum5() {
        return star[0][4] + star[1][5] + star[2][6] + star[3][7] - 4 * ('A' - 1);
    }

    public static int sum6() {
        return star[1][1] + star[2][2] + star[3][3] + star[4][4] - 4 * ('A' - 1);
    }
}