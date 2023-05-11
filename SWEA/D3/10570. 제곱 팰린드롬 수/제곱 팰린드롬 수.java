import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static boolean isPalindrome(int N) {
        char [] num = String.valueOf(N).toCharArray();
        int len = num.length;
        for (int i = 0; i < len / 2; i++) {
            if (num[i] != num[len - i - 1])
                return false;
        }
        return true;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int i = A; i<= B; i++) {
                int N = i;
                int sqrtN = (int)Math.sqrt(i);
                if (N == sqrtN * sqrtN) {
                    if (isPalindrome(i) && isPalindrome(sqrtN))
                        count++;
                }
            }

            System.out.printf("#%d %d\n", test, count);
        }
    }
}