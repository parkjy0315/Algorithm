import java.util.*;
import java.util.stream.*;

class Solution {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
    
    public int solution(int a, int b) {
        int temp = b / gcd(a, b);
        
        while(temp != 1) {
            if(temp % 2 == 0) temp /= 2;
            else if(temp % 5 == 0) temp /= 5;
            else return 2;
        }
        
        return 1;
    }
}