import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long temp1 = Long.parseLong(st.nextToken(" "));
        long temp2 = Long.parseLong(st.nextToken(" "));

        System.out.println(Math.abs(temp1 - temp2));
    }
}