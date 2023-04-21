import java.util.PriorityQueue;

class Solution {
    public boolean check(PriorityQueue<Double> minHeap, int k) {
        for (double value : minHeap) {
            if (value < k)
                return false;
        }
        return true;
    }
    public int solution(int[] scoville, int k) {
        PriorityQueue<Double> minHeap = new PriorityQueue<>() {{
            for (int i = 0; i < scoville.length; i++) add((double)scoville[i]);
        }};

        int answer = 0;
        while (!check(minHeap, k)) {
            if (minHeap.size() >= 2) {
                double lowest = minHeap.peek(); minHeap.remove();
                double lowest2 = minHeap.peek(); minHeap.remove();
                minHeap.add(lowest + lowest2 * 2);
                answer++;
            } else {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}