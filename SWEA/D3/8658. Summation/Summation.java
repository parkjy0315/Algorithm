import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            String[] arr = br.readLine().split(" ");
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

            for (String n : arr) {
                min = Math.min(n.chars().map(c -> c - '0').sum(), min);
                max = Math.max(n.chars().map(c -> c - '0').sum(), max);
            }

            System.out.println(max + " " + min);
        }
    }
}

