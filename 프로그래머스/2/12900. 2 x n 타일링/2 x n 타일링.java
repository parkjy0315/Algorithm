/*
# 

[1] = 1
[2] = ([1] + 1)
[3] = ([1] + [2])
[4] = ([1] + )
[5] = (1 + 4 + 3) = 8
[6]
*/

class Solution {
    
    int ANSWER_MAX = 1_000_000_007;
    
    public long solution(int n) {
        long[] counts = new long[n + 1];
        counts[1] = 1;
        counts[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            counts[i] = (counts[i - 1] + counts[i - 2]) % ANSWER_MAX;
        }
        
        return counts[n];
    }
}