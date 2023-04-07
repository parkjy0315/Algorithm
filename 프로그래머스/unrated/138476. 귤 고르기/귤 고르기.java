import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int len = tangerine.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<len; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = map.entrySet()
                .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList());

        int answer = 0;
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            sum += entry.getValue();
            answer++;
            if (sum >= k) {
                break;
            }

        }
        return answer;
    }
}