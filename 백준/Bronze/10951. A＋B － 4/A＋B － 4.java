import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int[] input = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(input[0] + input[1]);
        }
    }
}