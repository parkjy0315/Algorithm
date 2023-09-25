import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());

        Integer[] tips = new Integer[N];
        for (int i = 0; i < N; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tips, Collections.reverseOrder());

        long total = 0;
        for (int i = 0; i < N; i++) {
            int tip = tips[i] - i;
            if (tip < 0) {
                break;
            }

            total += tip;
        }

        bw.write(total + "\n");

        bw.close();
        br.close();
    }
}