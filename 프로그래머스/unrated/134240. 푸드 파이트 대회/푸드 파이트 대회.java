class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<food.length; i++) {
            if(food[i] >= 2) {
                answer.append((i + "").repeat(food[i] / 2));
            }
        }
        return answer.toString() + "0" + answer.reverse().toString();
    }
}