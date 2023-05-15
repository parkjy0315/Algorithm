import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            String input = br.readLine();

            // 패턴 길이를 통해 검사
            for (int len = 1; len <= 10; len++) {
                // 패턴 후보 설정
                String pattern = input.substring(0, len);

                // 패턴 후보가 반복되는지 검사
                int i = len;
                while(i + len <= input.length()) { // 입력받은 문자열 길이 이하인 경우까지 반복 검사
                    String temp = input.substring(i, i + len);
                    if (!pattern.equals(temp)) { // 패턴이 일치하지 않는 경우
                        break;
                    }
                    i += len;
                }

                if (i >= input.length() || i + len > input.length()) {
                    System.out.printf("#%d ", test);
                    System.out.println(len);
                    break;
                }
            }
        }
    }
}

