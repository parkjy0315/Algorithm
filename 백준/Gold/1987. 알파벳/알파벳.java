import java.util.Scanner;

public class Main {
    static int R, C;
    static char[][] board;
    static boolean[] visited = new boolean[26]; // 알파벳 A~Z 사용 여부
    static int max = 0;

    // 상하좌우 이동
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void dfs(int x, int y, int depth) {
        // 현재 위치의 알파벳 방문 처리
        visited[board[x][y] - 'A'] = true;
        max = Math.max(max, depth);

        // 4방향 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 보드 범위 내 & 해당 알파벳 방문 안 했으면 이동
            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                int nextChar = board[nx][ny] - 'A';
                if (!visited[nextChar]) {
                    dfs(nx, ny, depth + 1);
                }
            }
        }

        // 백트래킹 (다음 경로를 위해 방문 해제)
        visited[board[x][y] - 'A'] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        board = new char[R][C];

        // 입력 처리
        for (int i = 0; i < R; i++) {
            String line = sc.next();
            for (int j = 0; j < C; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        dfs(0, 0, 1);  // (0,0)에서 시작, 깊이 1부터
        System.out.println(max);
    }
}
