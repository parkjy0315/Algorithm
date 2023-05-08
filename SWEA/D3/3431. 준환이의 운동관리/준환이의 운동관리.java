import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long L = Integer.parseInt(st.nextToken());
            long U = Integer.parseInt(st.nextToken());
            long X = Integer.parseInt(st.nextToken());

            System.out.printf("#%d ", test);
            if (U < X) System.out.println(-1);
            else if (L <= X && X <= U) System.out.println(0);
            else System.out.println(L - X);
        }
    }
}
