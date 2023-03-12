import java.util.*;
class Solution {
    String [] dayOfWeeks = {
        "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
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
        
        return dayOfWeeks[totalDate % 7];
    }
}
