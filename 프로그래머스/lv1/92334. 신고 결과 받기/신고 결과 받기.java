import java.util.*;

class Solution {
    public int[] solution(String[] idList, String[] reports, int k) {
        // (유저 이름(String), 신고한 유저 내역(Set)) 신고 현황 맵 생성
        // (이름(String), 메일 받을 횟수(Integer)) 처리 결과 맵 생성
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> mailMap = new LinkedHashMap<>();
        Arrays.stream(idList).forEach(id -> mailMap.put(id, 0));
        // 신고 내역을 토대로 맵에 값 정리
        for(String report : reports) {
            String [] temp = report.split(" ");
            Set<String> set = reportMap.get(temp[1]);
            if(set == null) {
                set = new HashSet<>() {{ add(temp[0]); }};
                reportMap.put(temp[1], set);
            } else {
                set.add(temp[0]);
            }
        }

        // 맵을 기준으로 신고 기준에 적합한 이름 찾기
        for(String key : reportMap.keySet()) {
            // 신고 기준에 적합한 이름으로 신고한 사람의 처리 결과를 갱신
            Set<String> set = reportMap.get(key);
            if(set.size() >= k)
                // 처리 결과 맵(이름(String), 메일 받을 횟수(Integer))에 갱신
                set.stream().forEach(id -> mailMap.put(id, mailMap.get(id) + 1));
        }

        return mailMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}