import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        int size = numbers.length;
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}