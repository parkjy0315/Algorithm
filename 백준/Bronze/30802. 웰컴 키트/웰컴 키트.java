import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] sizes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] input = br.readLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);

        int tCount = 0;
        for (int size : sizes) {
            tCount += size % T == 0 ? size / T : size / T + 1;
        }

        int pCount = N / P;
        int pBuyDate = N % P;

        bw.write(tCount + "\n");
        bw.write(pCount + " " + pBuyDate + "\n");

        bw.close();
        br.close();
    }
}