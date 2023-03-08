import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        d = Arrays.stream(d).sorted().toArray();
        int answer = 0;
        int total = 0;
        for(int val : d) {
            if (total + val <= budget) {
                answer++;
                total += val;
            } else {
                break;
            }
        }
        return answer;
    }
}