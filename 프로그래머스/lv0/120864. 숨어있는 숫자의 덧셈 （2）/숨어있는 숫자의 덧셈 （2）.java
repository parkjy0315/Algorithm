import java.util.*;

class Solution {
    public int solution(String myString) {
        return Arrays.stream(myString.split("[a-zA-Z]+")).filter(s -> !s.equals("")).mapToInt(Integer::parseInt).sum();
    }
}