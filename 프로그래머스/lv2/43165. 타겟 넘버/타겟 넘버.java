import java.util.Arrays;

class Solution {
    public int dfs(int[] numbers, int index, int target) {
        if (index == numbers.length) {
            return Arrays.stream(numbers).sum() == target ? 1 : 0;
        }
        int res = dfs(numbers, index + 1, target);
        numbers[index] *= -1;
        res += +dfs(numbers, index + 1, target);
        return res;
    }

    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, target);
        return answer;
    }
}