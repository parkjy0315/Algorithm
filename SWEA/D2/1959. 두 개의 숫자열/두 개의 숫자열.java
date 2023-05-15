
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arrA = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] arrB = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (N > M) {
                int temp = N;
                N = M;
                M = temp;

                int [] tempArr = arrA;
                arrA = arrB;
                arrB = tempArr;
            }

            int max = 0;
            for (int i = 0; i <= M - N; i++) {
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    temp += arrA[j] * arrB[i + j];
                }

                if (max < temp) {
                    max = temp;
                }
            }

            System.out.printf("#%d ", test);
            System.out.println(max);
        }
    }
}

