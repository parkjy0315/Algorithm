import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int M;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map<String, String> passwdMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            passwdMap.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            String target = br.readLine();

            bw.write(passwdMap.get(target) + "\n");
        }


        bw.close();
        br.close();
    }
}