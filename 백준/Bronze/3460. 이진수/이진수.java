import java.io.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            String binaryStr = Integer.toBinaryString(n);
            Stream.iterate(0, i -> i + 1).limit(binaryStr.length())
                    .filter(i -> binaryStr.charAt(i) == '1')
                    .sorted(Comparator.reverseOrder())
                    .forEach(i -> {
                        try {
                            bw.write(binaryStr.length() - 1 - i + " ");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
