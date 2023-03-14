import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(0, 9).filter(i -> Arrays.stream(numbers).filter(j -> i == j).count() == 0).sum();
    }
}