import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] split = terms[i].split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String[] dateInfo = split[0].split("[/.]");
            int year = Integer.parseInt(dateInfo[0]);
            int month = Integer.parseInt(dateInfo[1]);
            int date = Integer.parseInt(dateInfo[2]);
            int dueMonth = map.get(split[1]);

            month += dueMonth;
            while(month > 12) {
                year += 1;
                month -= 12;
            }

            String dateStr = String.format("%d.%02d.%02d", year, month, date);
            if (today.compareTo(dateStr) >= 0) {
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
