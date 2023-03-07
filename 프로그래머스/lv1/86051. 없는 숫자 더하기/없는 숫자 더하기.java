import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = IntStream.rangeClosed(0, 9).boxed().collect(Collectors.toList());
        return list.stream().filter(i -> Arrays.stream(numbers).filter(j -> i == j).count() == 0).mapToInt(Integer::intValue).sum();
    }
}