import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        int[] count = new int[10_001];

        int[] rope = new int[N];
        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        int[] maxWeight = new int[N];
        for (int i = 0; i < N; i++) {
            maxWeight[i] = rope[i] * (N - i);
        }

        Arrays.sort(maxWeight);

        bw.write(maxWeight[N - 1] + "\n");

        bw.close();
        br.close();
    }
}