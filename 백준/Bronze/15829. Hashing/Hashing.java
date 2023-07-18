import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

class Main {
    private static final long M = 1_234_567_891;
    private static final long r = 31;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();

        BigInteger H = new BigInteger("0");
        char[] charArr = input.toCharArray();
        for (int i = 0; i < L; i++) {
            BigInteger num = new BigInteger(String.valueOf(charArr[i] - 'a' + 1));
            BigInteger temp = new BigInteger(String.valueOf((int)Math.pow(r, i)));
            H = H.add(num.multiply(temp));
        }
        bw.write(H.mod(new BigInteger(String.valueOf(M))) + "\n");

        bw.close();
        br.close();
    }
}