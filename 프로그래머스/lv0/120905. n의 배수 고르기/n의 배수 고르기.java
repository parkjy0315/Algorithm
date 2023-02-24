import java.util.*;

class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(num -> num % n == 0).toArray();
    }
}