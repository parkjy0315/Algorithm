class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // 콜라가 a개 미만이 아닌 경우 계속 반복
        // 콜라 빈병을 a개 주면
        // 콜라 b병을 새로줌
        while(!(n < a)) {
            n -= a;
            n += b;
            answer += b;
        }
        return answer;
    }
}