import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String before, String after) {
        return Arrays.stream(before.split("")).sorted().collect(Collectors.joining())
            .equals(Arrays.stream(after.split("")).sorted().collect(Collectors.joining())) ? 1 : 0;
    }
}