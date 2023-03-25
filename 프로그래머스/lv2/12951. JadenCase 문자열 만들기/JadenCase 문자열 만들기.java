class Solution {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char pre = ' ';
        for(char c : s.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                if(Character.isSpaceChar(pre)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else {
                sb.append(c);
            }
            pre = c;
        }

        return sb.toString();
    }
}
