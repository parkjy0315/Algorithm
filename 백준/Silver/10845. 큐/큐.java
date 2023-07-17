import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
    private static List<String> queue = new ArrayList<>();
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    String input = st.nextToken();
                    queue.add(input);
                    break;
                case "pop":
                    String pop = queue.isEmpty() ? "-1" : queue.remove(0);
                    bw.write(pop);
                    bw.write("\n");
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()));
                    bw.write("\n");
                    break;
                case "empty":
                    bw.write(queue.isEmpty() ? "1" : "0");
                    bw.write("\n");
                    break;
                case "front":
                    String front = queue.isEmpty() ? "-1" : queue.get(0);
                    bw.write(front);
                    bw.write("\n");

                    break;
                case "back":
                    String back = queue.isEmpty() ? "-1" : queue.get(queue.size() - 1);
                    bw.write(back);
                    bw.write("\n");
                    break;
            }

        }

        bw.close();
        br.close();
    }
}