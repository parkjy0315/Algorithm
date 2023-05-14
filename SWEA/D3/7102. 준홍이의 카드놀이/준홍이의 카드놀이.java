import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            // 입력
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] count = new int[N + M];
            for (int i = 1; i < N; i++) {
                for (int j = 1; j < M; j++) {
                    count[i+j]++;
                }
            }

            int max = Arrays.stream(count).max().getAsInt();
            System.out.printf("#%d ", test);
            for(int i=0; i<N+M; i++) {
                if (count[i] == max)
                    System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}

