import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            int N = Integer.parseInt(br.readLine());
            String answer = br.readLine();
            String seokchan = br.readLine();

            int count = 0;
            for (int i = 0; i < N; i++) {
                char ch1 = answer.charAt(i);
                char ch2 = seokchan.charAt(i);
                if (ch1 == ch2)
                    count++;
            }

            System.out.println(count);
        }
    }
}