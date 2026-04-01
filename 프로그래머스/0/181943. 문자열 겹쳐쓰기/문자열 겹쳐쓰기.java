import java.util.*;

class Solution {
    public String solution(String myString, String overwriteString, int s) {
        StringBuilder sb = new StringBuilder();

        char[] charArray = myString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {            
            if (s <= i && i < s + overwriteString.length()) {
                sb.append(overwriteString.charAt(i - s));
            } else {
                sb.append(charArray[i]);
            }
        }
        
        return sb.toString();        
    }
}

