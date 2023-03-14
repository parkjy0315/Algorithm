import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> pList = Arrays.stream(participant).sorted().collect(Collectors.toList());
        List<String> cList = Arrays.stream(completion).sorted().collect(Collectors.toList());

        for (int i = 0; i < cList.size(); i++) {
            if(!pList.get(i).equals(cList.get(i))) {
                return pList.get(i);
            }
        }
        return pList.get(pList.size() - 1);
    }
}