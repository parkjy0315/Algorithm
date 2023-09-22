import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        int[] distance = new int[N - 1];
        int[] gasPrice = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            gasPrice[i] = Integer.parseInt(st.nextToken());
        }


        int gas = gasPrice[0];
        long total = gas * distance[0];
        for (int i=1; i<N - 1; i++) {
            gas = Math.min(gasPrice[i], gas);
            total += gas * distance[i];
        }

        bw.write(total + "\n");

        bw.close();
        br.close();
    }
}