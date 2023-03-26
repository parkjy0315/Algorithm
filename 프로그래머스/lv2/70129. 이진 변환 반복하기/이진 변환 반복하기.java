import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int zeroCnt = 0;
        int transForm = 0;
        while (!s.equals("1")) {
            zeroCnt += Arrays.stream(s.split("")).filter(i -> i.equals("0")).count();
            s = s.replaceAll("0", "");
            s = Integer.toString(s.length(), 2);
            transForm++;
        }

        return new int[]{transForm, zeroCnt};
    }
}