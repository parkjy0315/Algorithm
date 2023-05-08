import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            int N = Integer.parseInt(br.readLine());
            int[] stairs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int current = stairs[0];
            int up = 0, down = 0;
            for (int i = 1; i < N; i++) {
                if (current > stairs[i]) { // 내려감
                    down = Math.max(down, current - stairs[i]);
                } else { // 올라감
                    up = Math.max(up, stairs[i] - current);
                }
                current = stairs[i];
            }

            System.out.println(up + " " + down);
        }
    }
}