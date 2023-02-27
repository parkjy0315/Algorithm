class Solution {
    public int solution(int n) {
        int answer = 1;
        int pre = 1, now = 1;
        
        while(true) {
            if (now > n)
                break;
            
            pre = now;
            answer++;
            now = pre * answer;
        }
        
        return answer - 1;
    }
}