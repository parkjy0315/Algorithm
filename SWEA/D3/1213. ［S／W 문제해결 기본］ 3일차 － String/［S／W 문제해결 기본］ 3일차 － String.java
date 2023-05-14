import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int test = 1; test <= 10; test++) {
            System.out.printf("#%d ", test);

            br.readLine();

            // 입력 처리
            String str = br.readLine();
            String input = br.readLine();
            input = input.replaceAll(str, "#");

            System.out.println(input.chars().filter(ch -> ch == '#').count());
        }
    }
}

