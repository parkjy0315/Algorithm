import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int T;


    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] split = br.readLine().split(",");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);

            bw.write(A + B + "\n");
        }

        bw.close();
        br.close();
    }
}

