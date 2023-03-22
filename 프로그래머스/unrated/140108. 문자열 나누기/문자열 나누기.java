import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int start = 0; start < s.length(); start++) {
            Map<Character, Integer> map = new HashMap<>();
            int xVal = 0, others = 0;
            int i;
            for (i = start; i < s.length(); i++) {
                if (s.charAt(start) == s.charAt(i)) xVal++;
                else others++;

                if (xVal == others) {
                    answer++;
                    start = i;
                    break;
                }
            }
            if(i == s.length()) {
                answer++;
                break;
            }
        }

        return answer;
    }
}