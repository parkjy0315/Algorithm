import java.util.*;
import java.util.Map.*;

class Solution {
    public int[] solution(String[] idList, String[] reports, int k) {
        Map<String, Set<String>> reportedMap = new HashMap<>();
        Map<String, Integer> mailMap = new LinkedHashMap<>();
        
        Arrays.stream(idList).forEach((id) -> {
            reportedMap.put(id, new HashSet<String>());
            mailMap.put(id, 0);
        });
        
        for (String report : reports) {
            String[] temp = report.split(" ");
            String reporter = temp[0];
            String reported = temp[1];
            
            Set<String> reportedSet = reportedMap.get(reported);
            reportedSet.add(reporter);
        }
        
        for (Entry<String, Set<String>> entry : reportedMap.entrySet()) {
            if (entry.getValue().size() >= k) {
                entry.getValue().stream().forEach(id -> mailMap.put(id, mailMap.get(id) +1));
            }
        }
        
        return mailMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}