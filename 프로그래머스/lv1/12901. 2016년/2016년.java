import java.util.*;
class Solution {
    Map<Integer, String> map = new HashMap<>(){{
        put(0, "FRI");
        put(1, "SAT");
        put(2, "SUN");
        put(3, "MON");
        put(4, "TUE");
        put(5, "WED");
        put(6, "THU");
    }};
    int [] dates = {
            31, 29, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
    };

    public String solution(int a, int b) {
        String answer = "";
        
        int totalDate = b - 1;
        for(int i=0; i<a - 1; i++) {
            totalDate += dates[i];    
        }
        
        return map.get(totalDate % 7);
    }
}
