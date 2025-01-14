import java.util.*;

class Solution {
    public int[] solution(String[] names, int[] yearning, String[][] photos) {
        Map<String, Integer> yearningMap = new HashMap<>();

        for (int i=0; i<names.length; i++) {
            String key = names[i];
            Integer value = yearning[i];
            yearningMap.put(key, value);
        }

        int[] answer = new int[photos.length];
        int index = 0;
        for (String[] photo : photos) {
            int total = 0;
            for (String name : photo) {
                total += yearningMap.getOrDefault(name, 0);
            }
            answer[index++] = total;
        }

        return answer;
    }
}