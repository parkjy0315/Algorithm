import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. 자기보다 번호 작은 사람에게 빌려줘야 하는지 확인
        // 2. 자기가 여분이 필요한지 확인
        // 3. 자기보다 번호 큰 사람에게 빌려줘야 하는지 확인
        int answer = n - lost.length;
        List<Integer> lostList = Arrays.stream(lost).sorted().boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).sorted().boxed().collect(Collectors.toList());
        for (int num : reserve) {
            if (lostList.contains(num)) {
                answer++;
                lostList.remove(Integer.valueOf(num));
                reserveList.remove(Integer.valueOf(num));
            }
        }

        for (int num : reserveList) {
            if (lostList.contains(num - 1)) {
                answer++;
                lostList.remove(Integer.valueOf(num - 1));
            }
            else if (lostList.contains(num + 1)) {
                answer++;
                lostList.remove(Integer.valueOf(num + 1));
            }
        }

        return answer;
    }
}