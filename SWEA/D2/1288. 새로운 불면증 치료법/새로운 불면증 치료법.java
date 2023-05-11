import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            int N = Integer.parseInt(br.readLine());

            Set<Character> set = new HashSet<>();
            int i = 1;
            while (set.size() != 10) {
                String temp = String.valueOf(N * i++);
                for (char num : temp.toCharArray())
                    set.add(num);
            }

            System.out.printf("#%d %d\n", test, N * (i - 1));
        }
    }
}