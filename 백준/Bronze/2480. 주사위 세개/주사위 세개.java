import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());

        int result = 0;

        if (first == second && second == third) {
            result = 10000 + first * 1000;
        } else if (first == second) {
            result = 1000 + first * 100;
        } else if (second == third) {
            result = 1000 + second * 100;
        } else if (third == first) {
            result = 1000 + third * 100;
        } else {
            result = Math.max(first, Math.max(second, third)) * 100;
        }

        bw.write(result + "\n");

        bw.close();
        br.close();
    }
}