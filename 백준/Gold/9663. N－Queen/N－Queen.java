import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[] board;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        board = new int[N];

        backTracking(0);

        bw.write(count + "\n");

        bw.close();
        br.close();
    }

    public static void backTracking(int index) {
        if (index == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            board[index] = i;

            if (isPossible(index)) {
                backTracking(index + 1);
            }
        }
    }

    public static boolean isPossible(int index) {
        for (int i = 0; i < index; i++) {
            if (board[index] == board[i]) {
                return false;
            }
            else if (Math.abs(index - i) == Math.abs(board[index] - board[i])) {
                return false;
            }
        }

        return true;
    }
}