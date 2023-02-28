import java.util.*;
import java.util.stream.*;

class Solution {
    public int [] solution(int[] e) {
        return Arrays.stream(e).map(
                i -> Arrays.stream(e).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .indexOf(i) + 1)
            .toArray();
    }
}