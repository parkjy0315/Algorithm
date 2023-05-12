import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            int N = Integer.parseInt(br.readLine());


            System.out.printf("#%d ", test);
            for (int i=0; i<N; i++)
                System.out.print(1 + "/" + N + " ");
            System.out.println();
        }
    }
}