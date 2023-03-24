import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            for(int j=0; j<index; j++) {
                c = c + 1 <= 122 ? (char)(c + 1) : 'a';
                int check = skip.indexOf(c);
                if (check != -1) {
                    j--;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}