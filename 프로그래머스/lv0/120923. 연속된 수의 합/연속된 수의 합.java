import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int mid = total / num;
        int[] answer = new int[num];
        if (num % 2 == 1) {
            for (int i = 0; i < num / 2; i++) answer[i] = mid - (i + 1);
            for (int i = num / 2 + 1; i < num; i++) answer[i] = mid + (i - num / 2);
            answer[num / 2] = mid;
        } else {
            answer[num / 2] = mid + 1;
            answer[num / 2 - 1] = mid;
            for (int i = 0; i < num / 2 - 1; i++) answer[i] = answer[num / 2] - (i + 2);
            for (int i = num / 2 + 1; i < num; i++) answer[i] = answer[num / 2 - 1] + (i + 1- num / 2);
        }
        Arrays.sort(answer);
        return answer;
    }
}