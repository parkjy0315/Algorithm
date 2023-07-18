import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());

        int i;
        for (i=1; i<=M; i++) {
            int temp = i + (sumDigits(i));
            if (temp == M) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        if (i == M + 1) {
            bw.write("0");
        }

        bw.close();
        br.close();
    }
}