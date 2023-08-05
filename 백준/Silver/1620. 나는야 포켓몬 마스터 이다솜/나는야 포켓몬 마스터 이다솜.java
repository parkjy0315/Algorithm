import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> indexMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            nameMap.put(name, i + 1);
            indexMap.put(i + 1, name);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            try {
                int index = Integer.parseInt(input);
                bw.write(indexMap.get(index) + "\n");
            } catch (NumberFormatException e) {
                bw.write(nameMap.get(input) + "\n");
            }
        }

        bw.close();
        br.close();
    }
}