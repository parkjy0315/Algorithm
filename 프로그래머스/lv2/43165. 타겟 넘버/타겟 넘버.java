class Solution {
    public int dfs(int[] numbers, int sum, int index, int target) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        return dfs(numbers, sum + numbers[index], index + 1, target)
             + dfs(numbers, sum - numbers[index], index + 1, target);
    }

    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, 0, target);
        return answer;
    }
}