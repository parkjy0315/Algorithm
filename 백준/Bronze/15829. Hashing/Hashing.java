import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
    private static final long M = 1_234_567_891;
    private static final long r = 31;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();

        long H = 0;
        char[] charArr = input.toCharArray();
        for (int i = 0; i < L; i++) {
            char ch = charArr[i];
            long num = ch - 'a' + 1;
            H += num * Math.pow(r, i);
        }
        bw.write(H % M + "\n");

        bw.close();
        br.close();
    }
}