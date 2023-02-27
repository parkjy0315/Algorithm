class Solution {
    public String solution(int age) {
        String answer = "";
        
        for(char c : String.valueOf(age).toCharArray()) {
            answer += (char)('a' - '0' + c);
        }
        
        return answer;
    }
}