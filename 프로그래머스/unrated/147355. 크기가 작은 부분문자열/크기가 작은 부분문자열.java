import java.util.stream.IntStream;

class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        long value = Long.parseLong(p);
        return (int)IntStream.rangeClosed(0, t.length() - length)
                .filter(i -> Long.parseLong(t.substring(i, i+length)) <= value)
                .count();
    }
}