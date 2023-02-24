class Solution {
    public int[] solution(String my_string) {
        return my_string.chars().filter(s -> Character.isDigit(s)).map(i -> i - 48).sorted().toArray();
    }
}