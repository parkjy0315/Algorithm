import java.util.*;
import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger [] dp = new BigInteger[balls + 1];
        Arrays.fill(dp, new BigInteger("1"));
        
        for(int i=2; i<=balls; i++) {
            dp[i] = dp[i-1].multiply(new BigInteger(Integer.toString(i)));
        }
        
        return dp[balls].divide(dp[balls-share].multiply(dp[share]));
    }
}