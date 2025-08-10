import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] sizes = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] TP = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int T = TP[0];
        int P = TP[1];

        int tCount = 0;
        for (int size : sizes) {
            tCount += (int) Math.ceil(size / (double) T);
        }

        int pCount = N / P;
        int pBuyDate = N % P;

        bw.write(tCount + "\n");
        bw.write(pCount + " " + pBuyDate + "\n");

        bw.close();
        br.close();
    }
}