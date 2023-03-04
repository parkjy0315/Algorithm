import java.util.*;


class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            Integer count = map.get(array[i]);
            if (count != null) {
                map.put(array[i], ++count);
            } else {
                map.put(array[i], 1);
                count = 1;
            }

            if (max < count)
                max = count;
        }

        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            Integer count = map.get(key);
            if (count == max) {
                list.add(key);
            }
        }

        return list.size() > 1 ? -1 : list.get(0);
    }
}
