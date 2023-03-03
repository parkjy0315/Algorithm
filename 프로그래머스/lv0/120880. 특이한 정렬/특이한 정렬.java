import java.util.Arrays;


class Solution {
    public int[] solution(int[] numList, int n) {
        return Arrays.stream(numList)
                .map(i -> i - n)
                .boxed()
                .sorted((e1, e2) -> {
                    return Math.abs(e1) == Math.abs(e2) ? e2.compareTo(e1) : Integer.compare(Math.abs(e1), Math.abs(e2));
                })
                .map(i -> i + n)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}