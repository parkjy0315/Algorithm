import java.util.*;

// 매일 다른 옷을 조합
class Solution {
    public int solution(String[][] clothes) {
        // 모든 옷들의 조합 종류별로 저장
        Map<String, List<String>> clothesMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            List temp = clothesMap.getOrDefault(clothes[i][1], new ArrayList<>());
            temp.add(clothes[i][0]);
            clothesMap.put(clothes[i][1], temp);
        }

        int answer = 1;
        for (String key : clothesMap.keySet()) {
            answer *= (clothesMap.get(key).size() + 1);
        }
        return answer - 1;
    }
}