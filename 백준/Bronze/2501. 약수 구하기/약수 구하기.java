import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int i, index = 1;
        for (i=1; i<=N; i++) {
            if (N % i == 0) {
                if (index == K) {
                    bw.write(i + "\n");
                    break;
                }
                index++;
            }
        }

        if (i == N + 1) {
            bw.write("0\n");
        }

        bw.close();
        br.close();
    }
}
