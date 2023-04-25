import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int test = 0; test < N; test++) {
            String input = br.readLine();

            int score = 0;
            int combo = 1;
            for (char ch : input.toCharArray()) {
                // 맞은 경우
                if (ch == 'O') score += combo++;
                else combo = 1;
            }

            System.out.println(score);
        }
    }
}