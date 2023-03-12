import java.util.*;

class Solution {
    public int[] pattern1 = {1, 2, 3, 4, 5};
    public int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
    public int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int[] sum = new int[3];
        for(int i=0; i<answers.length; i++) {
            sum[0] += pattern1[i % pattern1.length] == answers[i] ? 1 : 0;
            sum[1] += pattern2[i % pattern2.length] == answers[i] ? 1 : 0;
            sum[2] += pattern3[i % pattern3.length] == answers[i] ? 1 : 0;
        }
        int max = Arrays.stream(sum).max().orElse(0);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<sum.length; i++) {
            if(sum[i] == max)
                list.add(i+1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}