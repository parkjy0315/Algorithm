class Solution {
    public boolean isPrime(int num) {
        for(int i=2; i<(int)Math.sqrt(num) + 1; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++) {
            if(isPrime(i))
                answer++;
        }
        return answer;
    }
}