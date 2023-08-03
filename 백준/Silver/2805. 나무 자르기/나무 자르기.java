import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] trees = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).sorted().toArray();

        int start = 0, end = trees[N - 1];

        while (start < end) {
            int mid = (start + end) / 2;
            long total = 0;

            for (int i=0; i<N; i++) {
                int temp = trees[i] - mid;
                if (temp > 0) {
                    total += temp;
                }
            }

            if (total < M) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        bw.write(start - 1 + "\n");

        bw.close();
        br.close();
    }
}