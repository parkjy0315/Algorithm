import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        for(int i=0; i<input.length; i++) {
            input[i] = new StringBuilder(input[i]).reverse().toString();
        }

        for (int i = 0; i < 3; i++) {
            char ch1 = input[0].charAt(i);
            char ch2 = input[1].charAt(i);

            if (ch1 > ch2) {
                System.out.println(input[0]);
                break;
            }
            else if (ch1 < ch2) {
                System.out.println(input[1]);
                break;
            }
        }
    }
}