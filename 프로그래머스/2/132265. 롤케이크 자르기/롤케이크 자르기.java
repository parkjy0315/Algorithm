import java.util.*;

class Solution {
    int total;
    
    public int solution(int[] topping) {
        total = topping.length;
        int[] aCumulate = leftPartCumulative(topping);
        int[] bCumulate = rightPartCumulative(topping);
        
        int answer = 0;
        for (int i = 0; i < total - 1; i++) {
            answer += aCumulate[i] == bCumulate[i + 1] ? 1 : 0;
        }
        
        return answer;
    }
    
    public int[] leftPartCumulative(int[] arr) {
        int[] temp = new int[arr.length];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < total; i++) {
            set.add(arr[i]);
            temp[i] = set.size();
        }
        
        return temp;
    }
    
    public int[] rightPartCumulative(int[] arr) {
        int[] temp = new int[arr.length];
        Set<Integer> set = new HashSet<>();
        for (int i = total - 1; i >= 0; i--) {
            set.add(arr[i]);
            temp[i] = set.size();
        }
        
        return temp;
    }
}