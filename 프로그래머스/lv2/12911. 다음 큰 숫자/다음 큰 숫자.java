class Solution {
    public int solution(int n) {
        int count = Integer.toBinaryString(n).replace("0", "").length();
        int answer = 0;
        for (int i = n + 1; ; i++) {
            int temp = Integer.toBinaryString(i).replace("0", "").length();
            if (temp == count) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}