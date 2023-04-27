import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String s) {
        Set<Integer> set = new LinkedHashSet<>();
        // 주어진 s를 각 집합으로 쪼갠 후 정렬
        String [] split = Arrays.stream(s.split("[{}]"))
                .filter(i -> !i.equals("") && !i.equals(","))
                .sorted((o1, o2) -> o1.length() - o2.length())
                .toArray(String[]::new);

        int[] answer = new int[split.length];
        int index = 0;
        // 집합 원소가 적은 순서대로 튜플 결과에 들어감
        List<Integer> preList = null;
        for (String temp : split) {
            List<Integer> list = Arrays.stream(temp.split(","))
                    .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

            for(int value : list) {
                set.add(value);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}