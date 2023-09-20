import java.util.*;

class Solution {
    private int n;
    private int m;
    private boolean[][] visited;
    private int[] dx = {1, 0, -1, 0};
    private int[] dy = {0, 1, 0, -1};
    private int maxCount = -1;

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        for (int i=0; i<n; i++) {
            Arrays.fill(visited[i], false);
        }

        bfs(maps);

        return maxCount;
    }

    public void bfs(int[][] maps) {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, 0));

        while(!queue.isEmpty()) {
            State current = queue.poll();
            int currX = current.x;
            int currY = current.y;

            if (currX == n - 1 && currY == m - 1) {
                if (maxCount < current.count + 1) {
                    maxCount = current.count + 1;
                    continue;
                }
            }

            for (int i=0; i<4; i++) {
                int newX = currX + dx[i];
                int newY = currY + dy[i];

                if ((0 <= newX && newX < n) && (0 <= newY && newY < m)) {
                    if (!visited[newX][newY] && maps[newX][newY] == 1) {
                        queue.add(new State(newX, newY, current.count + 1));
                        visited[newX][newY] = true;
                    }
                }
            }
        }
    }
}

class State {
    int x;
    int y;
    int count;

    public State(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}