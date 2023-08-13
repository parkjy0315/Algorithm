import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int T;

    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());

        for (int test = 0; test < T; test++) {
            String operator = br.readLine();
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine(), "\\[|,|\\]");

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int start = 0;
            int end = N;

            boolean errorFlag = false;
            for (char op : operator.toCharArray()) {
                switch (op) {
                    case 'R':
                        int temp = start;
                        start = end;
                        end = temp;
                        break;
                    case 'D':
                        if (start < end) {
                            start++;
                        } else if (start > end) {
                            start--;
                        } else {
                            errorFlag = true;
                        }
                        break;
                }

                if (errorFlag) {
                    bw.write("error\n");
                    break;
                }
            }

            if (!errorFlag) {
                bw.write("[");
                if (start < end) {
                    for (int i = start; i < end - 1; i++)
                        bw.write(arr[i] + ",");
                    bw.write(arr[end - 1] + "");
                } else if (start > end) {
                    for (int i = start - 1; i > end; i--)
                        bw.write(arr[i] + ",");
                    bw.write(arr[end] + "");
                }
                bw.write("]\n");
            }
        }

        bw.close();
        br.close();
    }
}

