import java.util.*;

class Solution {
    class Data {
        int index;
        int priority;

        public Data(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        List<Data> list = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(new Data(i, priorities[i]));
        }

        int index = 1;
        Data max = list.stream().max((o1, o2) -> o1.priority - o2.priority).get();
        while (!list.isEmpty()) {
            Data temp = list.get(0);
            if (temp.priority < max.priority) {
                list.remove(temp);
                list.add(temp);
            } else {
                if (temp.index == location)
                    return index;
                list.remove(temp);
                max = list.stream().max((o1, o2) -> o1.priority - o2.priority).get();
                index++;
            }
        }

        return index;
    }
}