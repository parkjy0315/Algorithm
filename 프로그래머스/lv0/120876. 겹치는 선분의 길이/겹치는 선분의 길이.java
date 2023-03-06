import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        List<Integer> overlapList = new ArrayList<>();
        List<Integer> totalList = new ArrayList<>();

        for(int [] line : lines) {
            for(int i=line[0]; i<line[1]; i++) {
                if (!totalList.contains(i)) {
                    totalList.add(i);
                } else {
                    if(!overlapList.contains(i))
                        overlapList.add(i);
                }
            }
        }

        return overlapList.size();   
    }
}