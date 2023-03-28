import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.*;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        Queue<Integer> queue = new LinkedList<>(IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList()));
        Queue<Integer> nextQueue = new LinkedList<>();

        while (true) {
            int num1 = queue.remove();
            int num2 = queue.remove();
            if ((num1 == a && num2 == b) || (num1 == b && num2 == a)) {
                break;
            } else if (num1 == a) {
                nextQueue.add(num1);
            } else if (num2 == a) {
                nextQueue.add(num2);
            } else if (num1 == b) {
                nextQueue.add(num1);
            } else if (num2 == b) {
                nextQueue.add(num2);
            } else {
                nextQueue.add(num1);
            }

            if (queue.isEmpty()) {
                queue = nextQueue;
                nextQueue = new LinkedList<>();
                answer++;
            }
        }

        return answer;
    }
}
