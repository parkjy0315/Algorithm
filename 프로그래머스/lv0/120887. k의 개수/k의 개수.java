import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int i, int j, int k) {
        return (int)IntStream.rangeClosed(i, j)
            .map(value -> 
                 (int)String.valueOf(value).chars()
                 .filter(c -> c == k + '0').count())
            .sum();
    }
}