import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        B += C;

        if (B >= 60) {
            int times = B / 60;
            A += times;
            B -= times * 60;
        }

        if (A >= 24) {
            A -= 24;
        }

        bw.write(A + " " + B + "\n");

        bw.close();
        br.close();
    }
}