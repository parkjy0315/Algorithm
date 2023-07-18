import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] cnt = new int[10001];
        for (int i = 1; i <= N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i] > 0) {
                bw.write(i + "\n");
                cnt[i]--;
            }
        }

        bw.close();
        br.close();
    }
}