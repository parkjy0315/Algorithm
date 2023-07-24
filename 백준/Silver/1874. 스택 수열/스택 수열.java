import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.stream.IntStream;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input > start) {
                for (int j = start + 1; j <= input; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = input;
            } else if (stack.peek() != input) {
                sb = new StringBuilder("NO");
                break;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}