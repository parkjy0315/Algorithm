import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int num;

            switch (input[0]) {
                case "add":
                    num = Integer.parseInt(input[1]);
                    set.add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(input[1]);
                    set.remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(input[1]);
                    if (set.contains(num)) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "toggle":
                    num = Integer.parseInt(input[1]);
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toSet());
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }

        bw.close();
        br.close();
    }
}