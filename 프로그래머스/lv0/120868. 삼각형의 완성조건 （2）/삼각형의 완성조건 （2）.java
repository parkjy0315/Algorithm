import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        if (sides[0] > sides[1]) answer += sides[0] - (sides[0] + 1 - sides[1]);
        else answer += sides[1] - (sides[1] + 1 - sides[0]);
        answer += sides[0] + sides[1] - Math.max(sides[0], sides[1]);
    
        return answer;
    }
}