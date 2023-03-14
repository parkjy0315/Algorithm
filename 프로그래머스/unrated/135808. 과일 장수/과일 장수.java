import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int total = 0;
        for(int i=score.length; i - m >= 0; i -= m) {
            total += score[i - m] * m;
        }

        return total;
    }
}