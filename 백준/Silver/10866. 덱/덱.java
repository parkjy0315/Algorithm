import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> deque = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String temp = st.nextToken();

            switch (temp) {
                case "push_front":
                    deque.add(0, st.nextToken());
                    break;
                case "push_back":
                    deque.add(st.nextToken());
                    break;
                case "pop_front":
                    String popFront = deque.isEmpty() ? "-1" : deque.remove(0);
                    bw.write(popFront + "\n");
                    break;
                case "pop_back":
                    String popBack = deque.isEmpty() ? "-1" : deque.remove(deque.size() - 1);
                    bw.write(popBack + "\n");
                    break;
                case "size":
                    bw.write(String.valueOf(deque.size()) + "\n");
                    break;
                case "empty":
                    bw.write(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    String front = deque.isEmpty() ? "-1" : deque.get(0);
                    bw.write(front + "\n");
                    break;
                case "back":
                    String back = deque.isEmpty() ? "-1" : deque.get(deque.size() - 1);
                    bw.write(back + "\n");
                    break;
            }
        }

        bw.close();
        br.close();
    }
}