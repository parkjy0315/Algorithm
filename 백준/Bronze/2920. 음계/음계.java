import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] ascendCheck = new int[8];
        int[] descendCheck = new int[8];
        for (int i = 0; i < input.length; i++) {
            ascendCheck[i] = (i + 1) == input[i] ? 1 : 0;
            descendCheck[i] = (input.length - i) == input[i] ? 1 : 0;
        }

        if (Arrays.stream(ascendCheck).sum() == 8) {
            System.out.println("ascending");
        }
        else if (Arrays.stream(descendCheck).sum() == 8) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }

    }
}