import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));
        return set.stream().sorted().filter(
            i -> s.chars().filter(
                c -> c == i.charAt(0)).count() == 1)
            .collect(Collectors.joining());
    }
}