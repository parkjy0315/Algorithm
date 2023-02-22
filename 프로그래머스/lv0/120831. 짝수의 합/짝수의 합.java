import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return Arrays.stream(IntStream.rangeClosed(1, n).toArray()).filter(v -> v%2 == 0).sum();
    }
}