import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
	public int solution(int[] scoville, int k) {
		Queue<Double> minHeap = new PriorityQueue<>(){{
			for (int s : scoville) 
				add((double)s);
		}};

		int mixCount = 0;
		while (minHeap.size() >= 2 && minHeap.peek() < k) {
			double firstMin = minHeap.poll();
			double secondMin = minHeap.poll();
			minHeap.add(firstMin + (secondMin * 2));
			mixCount++;
		}

		if (minHeap.size() <= 1 && minHeap.peek() < k) {
			return -1;
		}

		return mixCount;
	}
}