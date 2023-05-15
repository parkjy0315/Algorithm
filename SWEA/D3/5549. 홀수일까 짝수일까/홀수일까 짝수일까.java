
import java.io.*;
import java.math.BigInteger;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            bw.write(String.format("#%d ", test));

            BigInteger N = new BigInteger(br.readLine());

            if (N.mod(new BigInteger("2")).compareTo(new BigInteger("0")) == 0)
                bw.write("Even\n");
            else
                bw.write("Odd\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
