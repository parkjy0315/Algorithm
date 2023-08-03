import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);

        int[] liquid = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int min = Integer.MAX_VALUE;
        int[] minRes = new int[2];
        int start = 0, end = N - 1;

        while (start < end) {
            int result = liquid[start] + liquid[end];
            int dist = Math.abs(result);

            // 특성값이 갱신되는 경우
            if (min > dist) {
                min = dist;
                minRes[0] = liquid[start];
                minRes[1] = liquid[end];
            }

            if (result < 0) {
                start++;
            } else {
                end--;
            }
        }

        bw.write(minRes[0] + " " + minRes[1] + "\n");


        bw.close();
        br.close();
    }
}