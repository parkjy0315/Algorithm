import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
                new StringTokenizer(new BufferedReader(new InputStreamReader(System.in))
                        .readLine().trim(), " ").countTokens()
        );
    }
}