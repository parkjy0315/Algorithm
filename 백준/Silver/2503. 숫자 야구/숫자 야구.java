import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());

        int[][] answer = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            answer[i][0] = Integer.parseInt(st.nextToken());
            answer[i][1] = Integer.parseInt(st.nextToken());
            answer[i][2] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int num = 111; num <= 987; num++) {
            String temp = Integer.toString(num);
            if (temp.contains("0") || (
                    temp.charAt(0) == temp.charAt(1) ||
                    temp.charAt(1) == temp.charAt(2) ||
                    temp.charAt(0) == temp.charAt(2))) {
                continue;
            }

            int i;
            for (i = 0; i < N; i++) {
                if (!checkStrikeAndBall(answer[i], num)) {
                    break;
                }
            }

            if (i == N) {
                count++;
            }
        }

        bw.write(count + "\n");

        bw.close();
        br.close();
    }

    public static boolean checkStrikeAndBall(int[] answer, int num) {
        String ansStr = String.valueOf(answer[0]);
        String numStr = String.valueOf(num);
        int strike = calcStrike(ansStr, numStr);
        int ball = calcBall(ansStr, numStr) - strike;

        return answer[1] == strike && answer[2] == ball;
    }

    public static int calcStrike(String answer, String num) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (answer.charAt(i) == num.charAt(i)) {
                strike++;
            }
        }

        return strike;
    }

    public static int calcBall(String answer, String num) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (num.indexOf(answer.charAt(i)) != -1) {
                ball++;
            }
        }

        return ball;
    }
}