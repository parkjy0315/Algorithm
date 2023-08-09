import java.io.*;
import java.math.BigInteger;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final int TEST = 3;

    public static void main(String[] args) throws Exception {
        for (int test = 0; test < TEST; test++) {
            int N = Integer.parseInt(br.readLine());

            BigInteger total = new BigInteger("0");
            for (int i = 0; i < N; i++) {
                total = total.add(new BigInteger(br.readLine()));
            }

            if (total.compareTo(new BigInteger("0")) > 0) {
                bw.write("+\n");
            } else if (total.compareTo(new BigInteger("0")) < 0) {
                bw.write("-\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.close();
        br.close();
    }
}