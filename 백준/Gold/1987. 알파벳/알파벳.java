import java.io.*;
import java.util.*;

public class Main {
    private static int R, C;
    private static String[][] board;
    private static Set<String> visited = new HashSet<>();
    private static int max = 0;

    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 처리
        String[] input = br.readLine().split(" ");
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);

        board = new String[R][C];

        for (int i = 0; i < R; i++) {
            board[i] = new String[C];
            board[i] = br.readLine().split("");
        }

        // DFS, 백트랙킹 => 백트랙킹 return 조건에서 최대값 갱신 체크
        dfs(0, 0, 1);
        bw.write("" + max);

        bw.close();
        br.close();
    }

    private static void dfs(int x, int y, int count) {
        String currentString = board[x][y];
        visited.add(currentString);
        max = Math.max(max, count);

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if ((0 <= nx && nx < R) && (0 <= ny && ny < C)) {
                String newString = board[nx][ny];
                if (!visited.contains(newString)) {
                    dfs(nx, ny, count + 1);
                }
            }
        }

        visited.remove(currentString);
    }

}