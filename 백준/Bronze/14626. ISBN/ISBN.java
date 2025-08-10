import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ISBN = br.readLine().split("");
        int m = Integer.parseInt(ISBN[ISBN.length - 1]);
        int[] multiple = { 1, 3 };

        int missingIndex = -1;
        int total = 0;
        for (int i = 0; i < ISBN.length; i++) {
            if (ISBN[i].equals("*")) {
                missingIndex = i;
            } else {
                int value = Integer.parseInt(ISBN[i]);
                total += value * multiple[i % 2];
            }
        }

        for (int digit = 0; digit <= 9; digit++) {
            if ((total + digit * multiple[missingIndex % 2]) % 10 == 0) {
                bw.write(digit + "\n");
                break;
            }
        }

        bw.close();
        br.close();
    }
}