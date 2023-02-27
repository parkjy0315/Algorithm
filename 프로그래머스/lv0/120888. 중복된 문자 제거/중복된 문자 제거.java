import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
    }
}