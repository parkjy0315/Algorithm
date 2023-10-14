import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int TRUCK_AMOUNT = 3;
    private static final int MAX_TIME_RANGE = 100;

    public static void main(String[] args) throws Exception {
        int[] time = new int[MAX_TIME_RANGE + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < TRUCK_AMOUNT; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                time[j]++;
            }
        }

        int totalFee = 0;
        for (int j = 0; j <= MAX_TIME_RANGE; j++) {
            if (time[j] == 3) {
                totalFee += 3 * C;
            } else if (time[j] == 2) {
                totalFee += 2 * B;
            } else if (time[j] == 1) {
                totalFee += A;
            }
        }

        bw.write(totalFee + "\n");

        bw.close();
        br.close();
    }
}