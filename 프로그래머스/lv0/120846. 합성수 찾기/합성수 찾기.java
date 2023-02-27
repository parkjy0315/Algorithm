import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return (int)IntStream.rangeClosed(1, n)
            .filter(i -> (int)IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count() > 2)
            .count();
    }
}