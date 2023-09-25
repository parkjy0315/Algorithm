import java.util.*;

class Solution {
    private int SIZE;

    public int[] solution(int[] numbers) {
        SIZE = numbers.length;

        Stack<Integer> stack = new Stack<>();

        int[] result = new int[SIZE];

        stack.push(0);

        for (int i = 1; i < SIZE; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                result[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        
        return result;
    }
}