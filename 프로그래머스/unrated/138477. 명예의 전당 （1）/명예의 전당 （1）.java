import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 명예의 전당 리스트에 값 저장
        // 명예의 전당 리스트 크기와 k 비교 후
        // 적절한 최저 점수를 찾아서 answer 리스트에 저장
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);
            if(list.size() <= k) {
                answer.add(list.get(0));
            } else {
                list.remove(0);
                answer.add(list.get(0));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}