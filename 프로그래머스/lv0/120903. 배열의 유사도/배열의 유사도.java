import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();
    }
}