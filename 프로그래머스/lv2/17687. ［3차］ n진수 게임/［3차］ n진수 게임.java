class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();

        int current = 0;
        int i = 0;
        int count = 0;
        while (true) {
            // 미리 구할 숫자의 갯수가 만족될때까지 반복
            if (count == t) {
                break;
            }

            // 현재 숫자의 n진수 문자열 생성
            String temp = Integer.toString(current, n).toUpperCase();
            // 문자열의 각 글자씩 반복해 현재 순서가 p번째인지 확인
            for (char ch : temp.toCharArray()) {
                if (i + 1 == p) {
                    sb.append(ch);
                    count++;
                    if (count == t) {
                        break;
                    }
                }
                i = (i + 1) % m;
            }
            current++;
        }

        return sb.toString();
    }
}