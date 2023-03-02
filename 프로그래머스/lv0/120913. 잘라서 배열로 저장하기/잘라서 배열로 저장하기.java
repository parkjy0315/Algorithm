class Solution {
    public String[] solution(String myStr, int n) {
        int length = (int)Math.ceil((double)myStr.length() / n);
        String[] answer = new String[length];
        for(int i=0; i<length; i++) {
            int start = i * n;
            int end = (i+1) * n < myStr.length() ? (i+1) * n : myStr.length();
            answer[i] = myStr.substring(start, end);
        }

        return answer;
    }
}