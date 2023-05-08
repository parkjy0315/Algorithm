import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            int N = Integer.parseInt(br.readLine());
            if (N % 2 == 1) System.out.println((N+1) / 2);
            else System.out.println(-(N/2));
        }
    }
}
