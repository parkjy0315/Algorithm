import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            String origin = br.readLine();
            int count = 0;
            char current = '0';
            for (char ch : origin.toCharArray()) {
                if (current != ch) {
                    current = ch;
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

