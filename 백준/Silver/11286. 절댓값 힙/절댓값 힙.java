import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        Queue<Value> heap = new PriorityQueue<>();

        for (int test = 0; test < N; test++) {
            int input = Integer.parseInt(br.readLine());

            if (input != 0) {
                heap.add(new Value(new int[]{Math.abs(input), input}));
            } else {
                if (heap.isEmpty()) {
                    bw.write(0 + "\n");
                } else {
                    bw.write(heap.poll().arr[1] + "\n");
                }
            }
        }

        bw.close();
        br.close();
    }
}

class Value implements Comparable<Value> {
    int[] arr;

    public Value(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int compareTo(Value v) {
        int res = Integer.compare(this.arr[0], v.arr[0]);
        if (res == 0) {
            return Integer.compare(this.arr[1], v.arr[1]);
        }
        return res;
    }
}
