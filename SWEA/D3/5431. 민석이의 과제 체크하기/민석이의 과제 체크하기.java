import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int [] submit = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int [] nonSubmit = new int[N];

            for (int index : submit) {
                nonSubmit[index - 1] = 1;
            }

            for(int i=0; i<N; i++) {
                if (nonSubmit[i] == 0)
                    System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}

