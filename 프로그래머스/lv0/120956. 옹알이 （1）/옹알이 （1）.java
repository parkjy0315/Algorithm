public class Solution {
    String [] possibleList = {
        "aya", "ye", "woo", "ma"
    };

    public int solution(String[] babbling) {
        int answer = 0;

        for(String word : babbling) {
            for(String possible : possibleList) {
                if(word.contains(possible)) {
                    word = word.replaceAll(possible, " ").trim();
                }
            }
            if(word.equals(""))
                answer++;
        }

        return answer;
    }

}