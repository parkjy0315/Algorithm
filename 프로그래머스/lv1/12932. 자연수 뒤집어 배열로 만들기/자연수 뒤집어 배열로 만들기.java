import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}