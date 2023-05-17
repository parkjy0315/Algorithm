import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (isPrime(n))
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}