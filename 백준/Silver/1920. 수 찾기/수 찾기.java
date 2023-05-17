import java.io.*;
import java.util.*;

public class Main {
    public static int contains(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nArr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(st1.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] mArr = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            mArr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++) {
            bw.write(contains(nArr, mArr[i]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}