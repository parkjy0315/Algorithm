import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int index = 1;
        int i = 1;
        int sum = 0;
        while (true) {
            for (int j=0; j<i; j++) {
                if (A <= index && index <= B) {
                    sum += i;
                }

                if (index > B) {
                    break;
                }
                index++;
            }
            if (index > B) {
                break;
            }
            i++;
        }

        bw.write(sum + "\n");

        bw.close();
        br.close();
    }
}