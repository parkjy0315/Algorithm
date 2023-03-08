class Solution {
    public String solution(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if('A' <= c && c <= 'Z') {
                sb.append((char)((c - 'A' + n) % 26 + 'A'));
            } else if('a' <= c && c <= 'z'){
                sb.append((char)((c - 'a' + n) % 26 + 'a'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}