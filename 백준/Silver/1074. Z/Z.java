import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int index = 0;
    static int r;
    static int c;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, N);

        recursive(0, 0, size);

        bw.write(index + "\n");

        bw.close();
        br.close();
    }

    public static void recursive(int row, int col, int size) {
        if (size == 1) {
            return;
        }

        int nSize = size / 2;

        // 1사분면
        if (r < row + nSize && c < col + nSize) {
            recursive(row, col, nSize);
        }
        // 2사분면
        else if (r < row + nSize && col + nSize <= c) {
            index += size * size / 4;
            recursive(row, col + nSize, nSize);
        }
        // 3사분면
        else if (row + nSize <= r && c < col + nSize) {
            index += size * size / 4 * 2;
            recursive(row + nSize, col, nSize);
        }
        // 4사분면
        else if (row + nSize <= r && col + nSize <= c) {
            index += size * size / 4 * 3;
            recursive(row + nSize, col + nSize, nSize);
        }
    }
}