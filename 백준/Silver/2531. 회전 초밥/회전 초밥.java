import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int c = Integer.parseInt(input[3]);

        int[] rotate = new int[N];
        for (int i = 0; i < N; i++) {
            rotate[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int start = 0, end = k;
        int cnt = 0;

        while (start < N) {
            int idx;
            for (idx = start; idx < end; idx++) {
                set.add(rotate[idx % N]);
            }
            set.add(c);

            max = Math.max(max, set.size());
            set.clear();

            start++;
            end++;
        }

        bw.write(max + "\n");

        bw.close();
        br.close();
    }
}