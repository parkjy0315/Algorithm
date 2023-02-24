import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set1 = new HashSet<String>(Arrays.asList(s1));
        Set<String> set2 = new HashSet<String>(Arrays.asList(s2));
        
        if (s1.length > s2.length) {
            for(int i=0; i<s2.length; i++) {
                if (set1.contains(s2[i]))
                    answer++;
            }
        }
        else {
            for(int i=0; i<s1.length; i++) {
                if (set2.contains(s1[i]))
                    answer++;
            }
        }
        
        return answer;
    }
}