class Solution {
    public String solution(String my_string, int n) {
        StringBuffer answer = new StringBuffer();
        for(char c : my_string.toCharArray()) {
            answer.append((c + "").repeat(n));
        }
        return answer.toString();
    }
}