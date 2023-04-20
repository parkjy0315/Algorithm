import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        // 배포
        List<Integer> delivery = new ArrayList<>();
        int length = progresses.length;
        // 배포는 하루에 한번, 하루 끝에 진행
        // 처음 인덱스부터 진행해 각 speeds 만큼 각각 추가
        int index = 0;
        int count = 0;
        while (index != length) {
            // 현재 인덱스가 100일 때
            if (progresses[index] >= 100) {
                count++;
                // 현재 인덱스 바로 뒤부터 100인 경우
                for (int i = index + 1; i < length; i++) {
                    if (progresses[i] >= 100) {
                        count++;
                        index = i;
                    } else {
                        break;
                    }
                }
                // 모두 같이 배포
                delivery.add(count);
                count = 0;
                index++;
            }

            for (int i = index; i < length; i++) {
                progresses[i] += speeds[i];
            }
        }

        return delivery;
    }
}