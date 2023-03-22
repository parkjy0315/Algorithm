import java.util.*;

class Solution {
    String [] board = {"RT", "CF", "JM", "AN"};
    Map<String, Integer> map = new HashMap<>(){{
        put("R", 0); put("T", 0);
        put("C", 0); put("F", 0);
        put("J", 0); put("M", 0);
        put("A", 0); put("N", 0);
    }};

    public String solution(String[] survey, int[] choices) {
        for (int i=0; i<survey.length; i++) {
            String [] split = survey[i].split("");
            int score = choices[i] - 4;

            if (score > 0) {
                map.put(split[1], map.get(split[1]) + score);
            } else if(score < 0) {
                map.put(split[0], map.get(split[0]) + Math.abs(score));
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i=0; i< board.length; i++) {
            String [] split = board[i].split("");
            int val1 = map.get(split[0]);
            int val2 = map.get(split[1]);

            if (val1 >= val2) {
                answer.append(split[0]);
            } else if(val1 < val2) {
                answer.append(split[1]);
            }
        }
        return answer.toString();
    }
}