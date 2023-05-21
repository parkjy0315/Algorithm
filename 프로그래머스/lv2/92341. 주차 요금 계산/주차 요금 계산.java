import java.util.*;

class Solution {
    public int calcFee(int[] fees, int total) {
        int totalFee = fees[1];
        totalFee += total >= fees[0] ?
                Math.ceil((double)(total - fees[0]) / fees[2]) * fees[3] : 0;
        return totalFee;
    }
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> totalTime = new HashMap<>();
        Map<String, String> map = new HashMap<>();
        for (String record : records) {
            String[] split = record.split(" ");
            String temp = map.get(split[1]);

            if (temp == null) {
                map.put(split[1], split[0]);
            } else {
                if (split[2].equals("OUT")) {
                    map.remove(split[1]);
                }
                int[] timeSplit1 = Arrays.stream(temp.split(":"))
                        .mapToInt(Integer::parseInt).toArray();
                int[] timeSplit2 = Arrays.stream(split[0].split(":"))
                        .mapToInt(Integer::parseInt).toArray();

                int hour = timeSplit2[0] - timeSplit1[0];
                int minute = timeSplit2[1] - timeSplit1[1];
                int total = 60 * hour + minute;
                totalTime.put(split[1], totalTime.getOrDefault(split[1], 0) + total);
            }
        }
        for(String key : map.keySet()) {
            String temp = map.get(key);
            if (temp != null) {
                int[] timeSplit1 = Arrays.stream(temp.split(":"))
                        .mapToInt(Integer::parseInt).toArray();
                int[] timeSplit2 = {23, 59};

                int hour = timeSplit2[0] - timeSplit1[0];
                int minute = timeSplit2[1] - timeSplit1[1];
                int total = 60 * hour + minute;
                totalTime.put(key, totalTime.getOrDefault(key, 0) + total);
            }
        }

        Object[] mapKey = totalTime.keySet().toArray();
        Arrays.sort(mapKey);

        int[] answer = new int[mapKey.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = calcFee(fees, totalTime.get(mapKey[i]));
        }

        return answer;
    }
}