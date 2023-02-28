import java.util.*;

class Solution {
    public int findIndex(int [] arr, int value) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == value)
                return i;
        }
        return -1;
    }
    
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        Integer [] temp = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, Comparator.reverseOrder());
        
        for(int i=0; i<length; i++) {
            int index = findIndex(emergency, temp[i]);
            answer[index] = i+1;
        }
        
        return answer;
    }
}