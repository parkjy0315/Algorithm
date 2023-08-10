import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine().toLowerCase();

            if (input.equals("#")) {
                break;
            }

            int count = 0;
            for (char ch : input.toCharArray()) {
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                        break;
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}