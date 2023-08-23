import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder("I");
        for (int i = 0; i < N; i++) {
            sb.append("OI");
        }

        String target = sb.toString();
        String str = br.readLine();

        int count = 0;
        int size = 2 + N + (N - 1);
        for (int i = 0; i <= M - size; i++) {
            String temp = str.substring(i, i + size);
            if (target.equals(temp)) {
                count++;
            }
        }

        bw.write(count + "\n");

        bw.close();
        br.close();
    }
}