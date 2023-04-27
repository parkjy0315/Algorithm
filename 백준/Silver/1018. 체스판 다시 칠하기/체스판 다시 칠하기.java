import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int countChangeColor(int startRow, int startCol, char[][] map) {
        int count1 = 0;
        int count2 = 0;
        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if ((i+j) % 2 == 0) {
                    if (map[i][j] == 'B') {
                        count1++;
                    }
                    if (map[i][j] == 'W') {
                        count2++;
                    }
                } else {
                    if (map[i][j] == 'B') {
                        count2++;
                    }
                    if (map[i][j] == 'W') {
                        count1++;
                    }
                }
            }
        }

        return Math.min(count1, count2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nmSize = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = nmSize[0], M = nmSize[1];

        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N - 8 + 1; i++) {
            for (int j = 0; j < M - 8 + 1; j++) {
                int temp = countChangeColor(i, j, map);
                answer = Math.min(answer, temp);
            }
        }

        System.out.println(answer);
    }
}