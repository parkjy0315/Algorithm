import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test = 1; test <= 10; test++) {
            System.out.printf("#%d ", test);

            int size = Integer.parseInt(br.readLine());
            String[][] table = new String[size][size];
            for (int i = 0; i < size; i++) {
                table[i] = br.readLine().split(" ");
            }

            int count = 0;
            for (int i = 0; i < size; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < size; j++) {
                    sb.append(table[j][i]);
                }

                char pre = '2';
                for (char ch : sb.toString().toCharArray()) {
                    if (ch == '1') { // N인 경우 아래로 전진
                        pre = ch;
                    } else if (ch == '2'){ // S인 경우
                        // 이전값 중에 N이 있었다면
                        if (pre == '1') {
                            // count증가
                            count++;
                        }
                        pre = ch;
                    }
                }
            }
            System.out.println(count);
        }

    }
}