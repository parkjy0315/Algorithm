import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int T;

    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int num = Integer.parseInt(br.readLine());


            int i;

            loop:
            for (i = 1; i < num; i++) {
                for (int j = 1; j < num; j++) {
                    for (int k = 1; k < num; k++) {
                        int total = getTriangulerNumber(i) + getTriangulerNumber(j) + getTriangulerNumber(k);
                        if (total == num) {
                            bw.write("1\n");
                            break loop;
                        }
                    }
                }
            }

            if (i == num) {
                bw.write("0\n");
            }
        }

        bw.close();
        br.close();
    }

    public static int getTriangulerNumber(int n) {
        return n * (n + 1) / 2;
    }
}