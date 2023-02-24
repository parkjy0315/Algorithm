import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int [] answer = null;
        if (direction.equals("right")) {
            List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
            list.remove(numbers.length - 1);
            list.add(0, numbers[numbers.length - 1]);
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        } else {
            List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
            list.remove(0);
            list.add(numbers[0]);
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}