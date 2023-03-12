import java.util.*;

class Solution {
    public int[] solution(String s) {
        int [] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        String [] split = s.split("");
        for(int i=0; i<s.length(); i++) {
            answer[i] = i - map.getOrDefault(split[i], i + 1);
            map.put(split[i], i);
        }
        return answer;
    }
}