import java.util.*;
import java.util.stream.*;

class Solution {
    public boolean isPrime(int n) {
        for(int i=2; i<n; i++) 
            if (n % i == 0)
                return false;
        return true;
    }
    public int[] solution(int n) {
        return IntStream.rangeClosed(2, n).filter(i -> isPrime(i)).filter(i -> n % i == 0).toArray();
    }
}