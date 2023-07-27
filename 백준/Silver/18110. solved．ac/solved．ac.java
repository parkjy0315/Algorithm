import java.io.*;
import java.util.stream.IntStream;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] levels = IntStream.range(0, n)
                .map(i -> {
                    try {
                        return Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .sorted()
                .toArray();

        int total = 0;
        int criteria = (int) Math.round(0.15 * n);
        for (int i = criteria; i < n - criteria; i++) {
            total += levels[i];
        }

        total = (int) Math.round((double)total / (n - criteria * 2));

        bw.write(total + "\n");

        bw.close();
        br.close();
    }
}
