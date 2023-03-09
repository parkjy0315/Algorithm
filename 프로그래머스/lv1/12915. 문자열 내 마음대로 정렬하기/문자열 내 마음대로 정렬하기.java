import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        return (String[])Arrays.stream(strings)
                .sorted((s1, s2) -> { return s1.charAt(n) == s2.charAt(n) ? s1.compareTo(s2) : s1.charAt(n) - s2.charAt(n); })
                .toArray(String[]::new);
    }
}