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
        int[] addMatrix = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (j == i) {
                    addMatrix[j] = arr[i];
                } else {
                    addMatrix[j] = addMatrix[j-1] + arr[j];
                }

                if (addMatrix[j] == M) {
                    count++;
                }
            }
        }

        bw.write(count + "\n");

        bw.close();
        br.close();
    }
}