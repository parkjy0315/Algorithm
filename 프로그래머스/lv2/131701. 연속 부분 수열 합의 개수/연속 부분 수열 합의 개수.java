import java.util.*;

// 원형 수열 => 처음과 끝이 연결된 형태의 수열
class Solution {
    public int solution(int[] elements) {
        // 1 ~ 원형 수열의 원소까지
        // 부분 수열의 합으로 나올 수 있는 값 계산
        // 계산한 값을 Set에 저장
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= elements.length; i++) {
            // 맨 처음 원소 + 그다음 원소의 합 반복 계산
            for (int j = 0; j < elements.length; j++) {
                int sum = elements[j]; // 누적 합
                int count = 1; // 부분 수열의 원소 수
                int k = j + 1; // 부분 수열의 다음 원소 인덱스
                while(count++ != i) {
                    int idx = k++ % elements.length;
                    sum += elements[idx];
                }
                set.add(sum);
            }

        }

        return set.size();
    }
}