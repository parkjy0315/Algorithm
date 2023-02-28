class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int dist = Math.abs(array[0] - n);
        
        for(int num : array) {
            int temp = Math.abs(num - n);
            if (dist == temp) {
                answer = answer > num ? num : answer;
            }
            if (dist > temp) {
                answer = num;
                dist = temp;
            }
        }
        return answer;
    }
}