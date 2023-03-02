import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr, int n) {
        return IntStream.range(0, (int)Math.ceil((double)myStr.length() / n))
                .mapToObj(i -> i == myStr.length() / n ? myStr.substring(i * n) : myStr.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
    }
}