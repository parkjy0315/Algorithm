import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            String result = bfs(A, B);

            bw.write(result + "\n");
        }

        bw.close();
        br.close();
    }

    public static String bfs(int A, int B) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[10000];
        int[] prev = new int[10000];
        char[] commands = new char[10000];

        queue.add(A);
        visited[A] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == B) {
                break;
            }

            int[] nextNumbers = { D(current), S(current), L(current), R(current) };
            char[] commandChars = { 'D', 'S', 'L', 'R' };

            for (int i = 0; i < 4; i++) {
                int next = nextNumbers[i];
                if (!visited[next]) {
                    visited[next] = true;
                    prev[next] = current;
                    commands[next] = commandChars[i];
                    queue.add(next);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = B; i != A; i = prev[i]) {
            sb.append(commands[i]);
        }

        return sb.reverse().toString();
    }

    public static int D(int n) {
        return (n * 2) % 10000;
    }

    public static int S(int n) {
        return n == 0 ? 9999 : n - 1;
    }

    public static int L(int n) {
        return (n % 1000) * 10 + n / 1000;
    }

    public static int R(int n) {
        return (n % 10) * 1000 + n / 10;
    }

}