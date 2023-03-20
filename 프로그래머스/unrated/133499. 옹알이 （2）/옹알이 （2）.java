class Solution {
    public String[] word = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            // 연달아서 나오는 발음이 있으면 탈락
            for (int i=0; i<word.length; i++) {
                b = b.replaceAll(word[i], String.valueOf(i+1));
            }
            boolean check = true;
            String pre = "";
            for (String temp : b.split("")) {
                if (pre.equals(temp)) {
                    check = false;
                    break;
                }
                pre = temp;
            }

            // 연달아 안나오면서 4가지 발음으로 구성된 단어는 성공
            if (check && b.chars().filter(Character::isDigit).count() == b.length())
                answer++;
        }
        return answer;
    }
}