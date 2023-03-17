import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율 계산 = 스테이지에 도달 했으나 아직 클리어 못한 플레이어 수 / 스테이지에 도달 한 플레이어 수
        // stages 배열에 따라 플레이어가 도달한 스테이지수를 누적
        // 도달은 했으나 아직 클리어 못한 플레이어 수 누적
        int[] total = new int[N];
        int[] nonClear = new int[N];
        for (int stage : stages) {
            if (stage != N + 1) {
                nonClear[stage - 1]++;
                for (int i = 0; i < stage; i++) {
                    total[i]++;
                }
            } else {
                for (int i = 0; i < N; i++) {
                    total[i]++;
                }
            }

        }

        ArrayList<Double[]> failRate = new ArrayList<>();
        // 실패율에 인덱스와 값 할당
        for (int i = 0; i < N; i++) {
            // 시도자, 실패자가 아무도 없을 경우 0을 나누게 되므로 NaN 처리 필요
            double rate = Double.isNaN((double) nonClear[i] / total[i]) ? 0 : (double) nonClear[i] / total[i];

            failRate.add(new Double[]{(double) i + 1, rate});
        }

        // 정렬
        failRate.sort((o1, o2) -> Double.compare(o2[1], o1[1]));
        return failRate.stream().mapToInt(value -> value[0].intValue()).toArray();
    }
}