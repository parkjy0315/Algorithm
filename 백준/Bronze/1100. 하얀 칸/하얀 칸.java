import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final int SIZE = 8;

    public static void main(String[] args) throws Exception {
        int count = 0;

        for (int i = 0; i < SIZE; i++) {
            String input = br.readLine();
            char[] charArr = input.toCharArray();

            // 홀수 행 => 홀수 열 => 흰색
            // 짝수 행 => 짝수 열 => 흰색
            for (int j = 0; j < charArr.length; j++) {
                if ((i + 1) % 2 == (j + 1) % 2 && charArr[j] == 'F') {
                    count++;
                }
            }
        }

        bw.write(count + "\n");

        bw.close();
        br.close();
    }
}