import java.util.Stack;

class Solution {
    boolean solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty()) return false;
                    else stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }
}