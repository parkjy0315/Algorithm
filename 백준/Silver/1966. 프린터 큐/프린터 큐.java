import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
1. 현재 큐의 가장 앞에 있는 문서의 중요도 확인
2. 나머지 문서 중 현재 문서보다 중요도 높은 문서가 있다면 인쇄 x, 맨 뒤 배치
3.
 */

class PrintInfo {
    int priority;
    int index;

    public PrintInfo(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}


class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int test = 0; test < T; test++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            int[] priorities = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            List<PrintInfo> queue = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                queue.add(new PrintInfo(priorities[i], i));
            }

            int step = 1;
            while (!queue.isEmpty()) {
                PrintInfo head = queue.remove(0);
                int max = head.priority;
                for (int i = 0; i < queue.size(); i++) {
                    PrintInfo temp = queue.get(i);
                    if (temp.priority > max) {
                        max = temp.priority;
                    }
                }

                if (max != head.priority) {
                    queue.add(head);
                } else {
                    if (head.index == M) {
                        bw.write(step + "\n");
                        break;
                    }
                    step++;
                }
            }
        }

        bw.close();
        br.close();
    }
}