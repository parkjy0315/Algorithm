import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Double> list = Arrays.stream(score)
            .map(s -> ((double)s[0] + s[1]) / 2)
            .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int length = score.length;
        int [] answer = new int[length];

        for(int i=0; i<length; i++) {
            double avg = ((double)score[i][0] + score[i][1]) / 2;
            answer[i] = list.indexOf(avg) + 1;
        }

        return answer;
    }
}