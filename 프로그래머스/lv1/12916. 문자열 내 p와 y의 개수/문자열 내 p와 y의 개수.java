class Solution {
    boolean solution(String s) {
        return s.chars().filter(c -> c == 'p' || c == 'P').count() == s.chars().filter(c -> c == 'y' || c == 'Y').count() ? true : false;
    }
}