import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            // 입력 처리
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] solveInfo = new int[N];
            for (int i = 0; i < N; i++) {
                solveInfo[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sum();
            }

            int max = Arrays.stream(solveInfo).max().getAsInt();
            int count = 0;
            for (int solve : solveInfo) {
                if (max == solve)
                    count++;
            }

            System.out.println(count + " " + max);
        }
    }
}

