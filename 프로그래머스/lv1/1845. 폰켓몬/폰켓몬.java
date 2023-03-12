import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int max = (int)Arrays.stream(nums).distinct().count();
        return max > nums.length / 2 ? nums.length / 2 : max;
    }
}