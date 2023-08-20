import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int T;
    private static int N;

    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());


        for (int test = 0; test < T; test++) {
            N = Integer.parseInt(br.readLine());

            Map<String, Integer> clothes = new HashMap<>();

            for (int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                String name = st.nextToken();
                String category = st.nextToken();

                clothes.put(category, clothes.getOrDefault(category, 0) + 1);
            }

            int total = 1;

            for (int count : clothes.values()) {
                total *= (count + 1);
            }

            bw.write(total - 1 + "\n");
        }

        bw.close();
        br.close();
    }
}