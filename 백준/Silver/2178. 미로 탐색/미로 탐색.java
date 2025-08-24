/*
* N x M 배열 미로가 있음
* 1은 이동할 수 있는 칸, 0은 이동 불가능
* (1, 1) => (N, M) 위치로 이동할때 지나야 하는 최소 칸의 수 구하기

- BFS 최단 경로 계산
- 2차원 배열로 가능한 경로 탐색 후 최단 경로 갱신
*/

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    
    public static boolean isValidIndex(int x, int y, int N, int M) {
        return (0 <= x && x < N) && (0 <= y && y < M);
    }

    public static void bfs(int[][] maze, int N, int M) {
        Queue<int[]> queue = new LinkedList<>() {{ add(new int[]{0, 0}); }};
        boolean[][] visited = new boolean[N][M];

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            if (!visited[currentX][currentY]) {
                visited[currentX][currentY] = true;

                for (int i = 0; i < 4; i++) {
                    int nextX = currentX + dx[i];
                    int nextY = currentY + dy[i];
                    
                    if (!isValidIndex(nextX, nextY, N, M)) {
                        continue;   
                    }

                    if (visited[nextX][nextY] || maze[nextX][nextY] == 0) {
                        continue;
                    }

                    queue.add(new int[]{nextX, nextY});
                    maze[nextX][nextY] = maze[currentX][currentY] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        String[] input = br.readLine().split(" " );
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        int[][] maze = new int[N][M];
        for (int i = 0; i < N; i++) {
            maze[i] = Arrays.stream(br.readLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        }

        bfs(maze, N, M);
        bw.write(maze[N - 1][M - 1] + "\n");
        
        br.close();
        bw.close();
    }
}