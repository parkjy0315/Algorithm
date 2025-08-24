import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>() {{
            for (int i = 0; i < priorities.length; i++) 
                add(new int[]{i, priorities[i]});
        }};

        int executeCount = 0;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();

            int max = current[1];
            for (int[] item : queue) {
                if (max < item[1]) {
                    max = item[1];
                    break;
                }
            }

            if (max == current[1]) {
                executeCount++;

                if (current[0] == location) {
                    break;
                }
            } else {
                queue.add(current);
            }
        }

        return executeCount;
    }
}