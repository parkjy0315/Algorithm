import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] trees = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int start = 0;
        int end = trees[N - 1];
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (isPossible(trees, mid, M)) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        bw.write(String.format("%d", result));

        bw.close();
        br.close();
    }

    private static boolean isPossible(int[] trees, int height, int minimum) {
        long total = 0;

        for (int tree : trees) {
            total += tree > height ? tree - height : 0;
        }

        return total >= minimum;
    }
}