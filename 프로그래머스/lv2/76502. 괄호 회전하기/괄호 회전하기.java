import java.util.*;

class Solution {
    public boolean checkBracket(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char temp = stack.pop();
                        if (!((ch == ')' && temp == '(') ||
                                (ch == '}' && temp == '{') ||
                                (ch == ']' && temp == '['))) {
                            return false;
                        }
                    }
                    break;
            }
        }
        if (!stack.isEmpty())
            return false;

        return true;
    }

    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            String temp = sb.substring(i) + sb.substring(0, i);
            if (checkBracket(temp))
                answer++;
        }

        return answer;
    }
}
