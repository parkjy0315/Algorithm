import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;

    public static void main(String[] args) throws Exception {
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        int total = 0;
        int min = 0;
        for (int i=M; i<=N; i++) {
            if (isPrime(i)) {
                total += i;

                if (min == 0) {
                    min = i;
                }
            }
        }

        if (min == 0) {
            bw.write("-1\n");
        } else {
            bw.write(total + "\n" + min);
        }

        bw.close();
        br.close();
    }

    public static boolean isPrime(int num) {
        if (num >= 2) {
            for (int i = 2; i <= (int)Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }
}