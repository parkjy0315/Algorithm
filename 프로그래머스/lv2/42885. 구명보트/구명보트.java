import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int min = 0, max = people.length - 1;
        int answer = 0;
        while (min <= max) {
            if (people[min] + people[max] <= limit) {
                min++;
            }
            max--;
            answer++;
        }

        return answer;
    }
}