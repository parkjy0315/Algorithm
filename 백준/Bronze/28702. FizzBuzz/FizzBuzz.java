import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;
        boolean isFindNum = false;

        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = br.readLine();

            char c = input[i].charAt(0);

            if (c != 'F' && c != 'B') {
                num = Integer.parseInt(input[i]);
                isFindNum = true;
            }

            if (isFindNum) {
                num++;
            }
        }

        if (num % 3 == 0) {
            if (num % 5 == 0) {
                bw.write("FizzBuzz");
            } else {
                bw.write("Fizz");
            }
        } else {
            if (num % 5 == 0) {
                bw.write("Buzz");
            } else {
                bw.write(num + "");
            }
        }

        bw.close();
        br.close();
    }
}