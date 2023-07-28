import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception {
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(br.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        Queue<int[]> queue = new LinkedList<>();
        List<Integer> complex = new ArrayList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0) {
                    int temp = 0;
                    queue.add(new int[]{i, j});

                    while(!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int currX = curr[0];
                        int currY = curr[1];
                        if (map[currX][currY] != 0) {
                            map[currX][currY] = 0;
                            temp++;
                        }


                        for (int k = 0; k < 4; k++) {
                            int newX = currX + dx[k];
                            int newY = currY + dy[k];

                            if (0 <= newX && newX < N && 0 <= newY && newY < N) {
                                if (map[newX][newY] != 0) {
                                    queue.add(new int[]{newX, newY});
                                    map[newX][newY] = 0;
                                    temp++;
                                }
                            }
                        }
                    }
                    complex.add(temp);
                }
            }
        }

        complex.sort(Integer::compareTo);

        bw.write(complex.size() + "\n");
        for (int value : complex) {
            bw.write(value + "\n");
        }

        bw.close();
        br.close();
    }
}