import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<String, String> wordMap = new HashMap<>() {{
        put("zero", "0");
        put("one", "1");
        put("two", "2");
        put("three", "3");
        put("four", "4");
        put("five", "5");
        put("six", "6");
        put("seven", "7");
        put("eight", "8");
        put("nine", "9");
    }};

    public int solution(String s) {
        for(String key : wordMap.keySet()) {
            s = s.replaceAll(key, wordMap.get(key));
        }
        return Integer.parseInt(s);
    }
}