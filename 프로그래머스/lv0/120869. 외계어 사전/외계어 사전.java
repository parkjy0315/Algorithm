import java.util.*;


class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i=0; i<dic.length; i++) {
            int temp = 0;
            for(int j=0; j<spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    temp++;
                }
            }
            if(temp == spell.length) {
                answer = 1;
            }
        }
        return answer;
    }
}