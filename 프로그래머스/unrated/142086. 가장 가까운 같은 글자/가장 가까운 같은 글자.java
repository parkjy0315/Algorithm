import java.util.*;

class Solution {
    public int[] solution(String s) {
        int [] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        String [] split = s.split("");
        for(int i=0; i<s.length(); i++) {
            Integer index = map.get(split[i]);
            if(index != null) {
                answer[i] = i - index;
                map.put(split[i], i);
            } else {
                answer[i] = -1;
                map.put(split[i], i);
            }
        }
        return answer;
    }
}