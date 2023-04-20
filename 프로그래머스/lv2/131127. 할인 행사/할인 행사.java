import java.util.*;

class Solution {
    private final int MEMBER_LIMIT = 10; // 회원 자격 기간

    public int solution(String[] want, int[] numbers, String[] discount) {
        int answer = 0;

        for (int i = 0; i < discount.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            int length = i + MEMBER_LIMIT >= discount.length ? discount.length : i + MEMBER_LIMIT;
            for (int j = i; j < length; j++) {
                String key = discount[j];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            int j;
            for (j=0; j<want.length; j++) {
                String key = want[j];
                if (numbers[j] != map.getOrDefault(key, 0)) {
                    break;
                }
            }

            if (j == want.length) {
                answer++;
            }
        }

        return answer;
    }
}