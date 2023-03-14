import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int [] sort = Arrays.stream(score).sorted().toArray();
        int total = 0;
        for(int i=score.length; i - m >= 0; i -= m) {
            int [] temp = Arrays.copyOfRange(sort, i - m,  i);
            total += Arrays.stream(temp).min().getAsInt() * m;
        }

        return total;
    }
}