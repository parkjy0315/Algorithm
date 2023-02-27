import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(c -> String.valueOf((char)(49 + c))).collect(Collectors.joining());
    }
}