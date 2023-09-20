import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String block1 = "AAAA";
    private static String block2 = "BB";

    public static void main(String[] args) throws Exception {
        String input = br.readLine();
        String[] split = input.split("\\.");

        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '.') {
                sb.append(ch);
            } else {
                String part = split[index++];
                i += part.length() - 1;
                int len = part.length();
                if (len % 2 == 1) {
                    sb = new StringBuilder("-1");
                    break;
                } else {
                    for (int j = 0; j < len / 4; j++) {
                        sb.append(block1);
                    }
                    for (int j = 0; j < len % 4 / 2; j++) {
                        sb.append(block2);
                    }
                }
            }
        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}