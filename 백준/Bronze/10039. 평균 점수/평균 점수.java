import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int SIZE = 5;

    public static void main(String[] args) throws Exception {
        int total = 0;
        for (int i=0; i<SIZE; i++) {
            int score = Integer.parseInt(br.readLine());
            if (score < 40) {
                score = 40;
            }
            total += score;
        }

        bw.write(total / SIZE + "\n");

        bw.close();
        br.close();
    }
}