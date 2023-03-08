import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder("0".repeat(n));
            DecimalFormat df = new DecimalFormat(sb.toString());
            answer[i] = String.valueOf(
                    Arrays.stream(df.format(Long.parseLong(Long.toString(arr1[i] | arr2[i], 2)))
                            .split(""))
                            .map(s -> s.equals("1") ? "#" : " ")
                            .collect(Collectors.joining())
            );
        }

        return answer;
    }
}