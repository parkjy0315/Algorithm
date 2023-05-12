import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for(int i=0; i<len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);
            String input = br.readLine();
            if (isPalindrome(input)) System.out.println(1);
            else System.out.println(0);
        }
    }
}

