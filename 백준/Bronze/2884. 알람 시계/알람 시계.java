import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray();

        input[1] -= 45;
        if (input[1] < 0) {
            input[1] += 60;
            input[0] -= 1;
        }
        if (input[0] < 0) {
            input[0] += 24;
        }
        System.out.println(input[0] + " " + input[1]);
    }
}