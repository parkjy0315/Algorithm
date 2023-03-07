import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int [] answer = new int[arr.length - 1];
        if(answer.length == 0) return new int[] {-1};
        else {
            int min = Arrays.stream(arr).min().orElse(0);
            int j=0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != min) {
                    answer[j++] = arr[i];
                }
            }
        }
        return answer;
    }
}