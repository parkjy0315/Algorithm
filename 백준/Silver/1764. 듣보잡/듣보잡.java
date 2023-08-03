import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        int total = 0;

        for (int i = 0; i < N + M; i++) {
            String name = br.readLine();
            int value = map.getOrDefault(name, 0) + 1;

            if (value == 2) {
                total++;
            }

            map.put(name, value);
        }

        bw.write(total + "\n");

        List<String> list = map.keySet().stream().collect(Collectors.toList())
                .stream().sorted().collect(Collectors.toList());

        for (String key : list) {
            if (map.get(key) == 2) {
                bw.write(key + "\n");
            }
        }


        bw.close();
        br.close();
    }
}