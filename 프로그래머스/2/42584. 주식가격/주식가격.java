class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int size = prices.length;
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }   
        }
        
        return answer;
    }
}