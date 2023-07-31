import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            set.add(val);
        }

        List<Integer> list = set.stream()
                .sorted()
                .collect(Collectors.toList());

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int val1 = list.get(i);
            for (int j = list.size() - 1; j >= i; j--) {
                int val2 = list.get(j);
                int dist = val2 - val1;

                if (dist < M) {
                    continue;
                }

                min = Math.min(val2 - val1, min);
            }
        }

        bw.write(min + "\n");

        bw.close();
        br.close();
    }
}