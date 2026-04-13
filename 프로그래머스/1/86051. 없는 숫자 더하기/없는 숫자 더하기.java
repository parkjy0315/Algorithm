import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(0, 9)
            .filter(i -> Arrays.stream(numbers).noneMatch(j -> i == j))
            .sum();
    }
}