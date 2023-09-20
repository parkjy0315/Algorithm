import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int head = 1;
        int tail = M;

        int J = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < J; i++) {
            int pos = Integer.parseInt(br.readLine());

            if (!(head <= pos && pos <= tail)) {
                if (pos < head) {
                    total += head - pos;
                    head = pos;
                    tail = head + M - 1;
                } else {
                    total += pos - tail;
                    tail = pos;
                    head = tail - M + 1;
                }
            }
        }

        bw.write(total + "\n");

        bw.close();
        br.close();
    }
}