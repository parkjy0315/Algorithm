import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int answer = 0;
        int length = citations.length;
        for (int i = 0; i <= citations[length - 1]; i++) {
            int h = i;
            int cnt1 = 0;
            int cnt2 = 0;
            for (int j = 0; j < length; j++) {
                if (h <= citations[j]) cnt1++;
                else if (h >= citations[j]) cnt2++;
            }
            if (h <= cnt1 && h >= cnt2) {
                answer = h;
            }
        }
        
        return answer;
    }
}