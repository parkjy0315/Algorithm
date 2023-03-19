import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 두 수가 가지는 항목의 맵을 각각 생성
        // 조합가능한 숫자 맵 생성
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        Map<String, Integer> combine = new HashMap<>();

        Arrays.stream(X.split(""))
                .forEach(s -> xMap.put(s, 1 + xMap.getOrDefault(s, 0)));
        Arrays.stream(Y.split(""))
                .forEach(s -> yMap.put(s, 1 + yMap.getOrDefault(s, 0)));

        // 겹치는 수의 숫자중 작은 값이 조합가능한 숫자
        for (String key : xMap.keySet()) {
            if (yMap.containsKey(key)) {
                int value = xMap.get(key) > yMap.get(key) ? yMap.get(key) : xMap.get(key);
                combine.put(key, value);
            }
        }

        // 생성된 조합가능 숫자 맵의 가장 큰 숫자부터 순서대로 합침
        StringBuilder sb = new StringBuilder();
        for (String key : combine.keySet()) {
            sb.append(key.repeat(combine.get(key)));
        }
        if (sb.toString().equals(""))
            return "-1";

        String answer =  sb.reverse().toString();
        return answer.startsWith("0") ? "0" : answer;
    }
}
