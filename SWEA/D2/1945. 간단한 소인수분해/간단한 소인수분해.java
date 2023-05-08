import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    private static int[] DIVIDOR_ARR = {2, 3, 5, 7, 11};

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            int N = Integer.parseInt(br.readLine());
            int[] count = new int[5];

            while (N != 1) {
                for (int i = 0; i < count.length; i++) {
                    int dividor = DIVIDOR_ARR[i];
                    if (N % dividor == 0) {
                        N /= dividor;
                        count[i]++;
                    }
                }
            }
            System.out.printf("#%d ", test);
            for (int i = 0; i < count.length; i++)
                System.out.print(count[i] + " ");
            System.out.println();
        }
    }
}
