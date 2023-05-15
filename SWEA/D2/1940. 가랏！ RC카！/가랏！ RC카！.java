
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            bw.write(String.format("#%d ", test));

            int speed = 0;
            int distance = 0;
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                int[] commands = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();


                switch (commands[0]) {
                    case 1:
                        speed += commands[1];
                        break;
                    case 2:
                        speed -= commands[1];
                        speed = Math.max(speed, 0);
                        break;
                }
                distance += speed;
            }


            bw.write(distance + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
