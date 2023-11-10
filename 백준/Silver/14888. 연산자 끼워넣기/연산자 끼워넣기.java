import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[] num;
    static int[] operator;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        operator = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(num[0], 1);

        bw.write(max + "\n");
        bw.write(min + "\n");

        bw.close();
        br.close();
    }

    public static void backTracking(int current, int index) {
        if (index == N) {
            max = Math.max(current, max);
            min = Math.min(current, min);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0: backTracking(current + num[index], index + 1); break;
                    case 1: backTracking(current - num[index], index + 1); break;
                    case 2: backTracking(current * num[index], index + 1); break;
                    case 3: backTracking(current / num[index], index + 1); break;
                }

                operator[i]++;
            }
        }
    }
}