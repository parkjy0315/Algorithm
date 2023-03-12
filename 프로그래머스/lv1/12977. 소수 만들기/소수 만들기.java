class Solution {
    public boolean isPrime(int n) {
        for(int i=2; i<(int)Math.sqrt(n) + 1; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        for(int i=0; i<len - 2; i++) {
            for(int j=i+1; j<len-1; j++) {
                for(int k=j+1; k<len; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(isPrime(num)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}