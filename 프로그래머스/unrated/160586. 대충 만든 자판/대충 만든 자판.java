import java.util.*;

class Solution {
    public int[] solution(String[] keyMap, String[] targets) {
        Map<String, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
    
        for(String key : keyMap) {
            String [] split = key.split("");
            for(int i=0; i<key.length(); i++) {
                int value = map.getOrDefault(split[i], -1);
                if(value == -1) 
                    value = i + 1;
            
                value = Math.min(value, i + 1);
                map.put(split[i], value);       
            }
        }
        
        for(int i=0; i<targets.length; i++) {
            for(String s : targets[i].split("")) {
                int value = map.getOrDefault(s, -1);
                if (value == -1) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += value;
            }
        }
        
        return answer;
    }
}