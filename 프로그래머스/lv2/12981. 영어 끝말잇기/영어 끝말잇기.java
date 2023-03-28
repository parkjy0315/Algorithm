import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 지금까지 나온 단어 Set 생성
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (wordSet.contains(words[i])) {
                int num = (i + 1) % n == 0 ? n : (i + 1) % n;
                return new int[]{num, i / n + 1};
            } else {
                String pre = words[i-1];
                if (pre.charAt(pre.length() - 1) == words[i].charAt(0)) {
                    wordSet.add(words[i]);
                } else {
                    int num = (i + 1) % n == 0 ? n : (i + 1) % n;
                    return new int[]{num, i / n + 1};
                }
            }
        }

        return new int[]{0, 0};
    }
}
