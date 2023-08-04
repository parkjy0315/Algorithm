import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> heap = new PriorityQueue<>();

        for (int i=0; i<N; i++) {
            int input = Integer.parseInt(br.readLine());

            // 2번 연산
            if (input == 0) {
                int res = heap.isEmpty() ? 0 : heap.poll();
                bw.write(res + "\n");
            }
            // 1번 연산
            else {
                heap.add(input);
            }
        }

        bw.close();
        br.close();
    }
}