import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int B = Integer.parseInt(inputs[2]);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[][] area = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                area[i][j] = Integer.parseInt(temp[j]);
                min = Math.min(min, area[i][j]);
                max = Math.max(max, area[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for (int height = min; height <= max; height++) {
            int time = 0;
            int block = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int dist = area[i][j] - height;
                    // 땅을 파야 하는 경우
                    if (dist > 0) {
                        time += 2 * dist;
                    }
                    // 땅을 덮어야 하는 경우
                    else if (dist < 0) {
                        time += Math.abs(dist);
                    }
                    block += dist;
                }
            }

            if (block >= 0 && minTime >= time) {
                if (maxHeight < height) {
                    maxHeight = height;
                }
                minTime = time;
            }
        }


        bw.write(minTime + " " + maxHeight + "\n");

        bw.close();
        br.close();
    }
}
