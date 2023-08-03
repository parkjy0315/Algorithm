import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split("-");

        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            int temp = 0;
            String[] part = input[i].split("\\+");

            for (int j = 0; j < part.length; j++) {
                temp += Integer.parseInt(part[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        bw.write(sum + "\n");

        bw.close();
        br.close();
    }
}