import java.util.*;

class Solution {
    private final int MAX_LENGTH = 5;
    private String[] VOWELS = {"A", "E", "I", "O", "U"};
    private int index = 0;
    private int answer = -1;

    public int solution(String word) {
        for (String start : VOWELS) {
            if (answer != -1) {
                break;
            }

            dfs(start, word);
        }

        return answer;
    }

    public void dfs(String pre, String word) {
        if (pre.length() > MAX_LENGTH || answer != -1) {
            return;
        }

        index++;

        if (pre.equals(word)) {
            answer = index;
            return;
        }

        for (String ch : VOWELS) {
            dfs(pre + ch, word);
        }
    }
}