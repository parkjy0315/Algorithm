class Solution {
    public int solution(int n) {
        boolean isEven = n % 2 == 0;
        
        int sum = 0;
        if (isEven) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum += i * i;                
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    sum += i;                    
                }
            }
        }
        
        return sum;
    }
}