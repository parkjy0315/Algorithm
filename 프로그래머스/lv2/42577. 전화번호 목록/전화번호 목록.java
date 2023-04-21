import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        int len = phoneBook.length;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.put(phoneBook[i], i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < phoneBook[i].length(); j++) {
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;
            }
        }
        return true;
    }
}