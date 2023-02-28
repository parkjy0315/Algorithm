import java.util.*;

class Solution {
    public int solution(int[] array) {
       int[] temp = new int[array.length];
        for(int i=0; i<array.length; i++) {
            String tmp = String.valueOf(array[i]);
            temp[i] = (int)tmp.chars().filter(c -> c == '7').count();
        }
        
        int sum = 0;
        for(int v : temp) 
            sum += v;
        return sum;
    }
}