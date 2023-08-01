import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int count = 0, sum = 0;
        int end = 0;

        for (int start = 0; start < N; start++) {
            while (sum < M && end < N) {
                sum += arr[end++];
            }

            if (sum == M) {
                count++;
            }

            sum -= arr[start];
        }


        bw.write(count + "\n");

        bw.close();
        br.close();
    }
}





