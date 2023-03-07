import java.util.stream.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {
            int index = i;
            answer += IntStream.rangeClosed(1, i).filter(j -> index % j == 0).count() % 2 == 0 ? i : -i;
        }
            

        return answer;
    }
}