import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        long A = Long.parseLong(strs[0]);
        long B = Long.parseLong(strs[1]);
        long C = Long.parseLong(strs[2]);

        System.out.println(A+B+C);
    }
}
