import java.util.*;

class Solution {
    private Map<String, Integer> map = new HashMap<>() {{
        put("zero", 0);
        put("one", 1);
        put("two", 2);
        put("three", 3);
        put("four", 4);
        put("five", 5);
        put("six", 6);
        put("seven", 7);
        put("eight", 8);
        put("nine", 9);
    }};
    
    public long solution(String numbers) {
        for(String key : map.keySet()){
            numbers = numbers.replaceAll(key, String.valueOf(map.get(key)));
        }
        System.out.println(numbers);
        return Long.parseLong(numbers);
    }
}