import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int k) {
        PriorityQueue<Double> minHeap = new PriorityQueue<>() {{
            for (int i = 0; i < scoville.length; i++) add((double)scoville[i]);
        }};

        int answer = 0;
        while (minHeap.size() >= 2 && minHeap.peek() < k) {
            double lowest = minHeap.peek(); minHeap.remove();
            double lowest2 = minHeap.peek(); minHeap.remove();
            minHeap.add(lowest + lowest2 * 2);
            answer++;
        }

        if (minHeap.size() <= 1 && minHeap.peek() < k)
            answer = -1;
        
        return answer;
    }
}