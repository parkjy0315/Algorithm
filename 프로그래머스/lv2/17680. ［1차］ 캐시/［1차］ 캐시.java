import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        // 참조된 시간을 따로 기록하도록 Map을 통해 구현
        // 키 = 도시이름, 값 = 참조된 시간
        Map<String, Integer> cache = new HashMap<>();

        // 도시 이름을 처리
        int answer = 0;
        for(int i=0; i<cities.length; i++) {
            String city = cities[i].toLowerCase();

            // 캐시에 있다면? hit
            if (cache.containsKey(city)) {
                answer += 1;
                cache.put(city, i);
            }
            // 없다면? miss
            else {
                // 캐시 최대 크기가 0 인 경우
                if (cacheSize == 0) {
                    answer += 5;
                    continue;
                }
                // 캐시 최대 크기 보다 작은 경우 캐시에 단순 추가
                else if (cache.size() < cacheSize) {
                    cache.put(city, i);
                }
                // 캐시가 꽉찬 경우 => 가장 오랫동안 참조되지 않은 값 삭제 후 추가
                else {
                    String deleteKey = "";
                    int lateTime = Integer.MIN_VALUE;
                    for (String key : cache.keySet()) {
                        int time = i - cache.get(key);
                        if (lateTime < time) {
                            deleteKey = key;
                            lateTime = time;
                        }
                    }
                    cache.remove(deleteKey);
                    cache.put(city, i);
                }
                answer += 5;
            }
        }


        return answer;
    }
}