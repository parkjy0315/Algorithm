class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++) {
            String [] split = quiz[i].split(" ");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[2]);
            int res = Integer.parseInt(split[4]);

            switch(split[1]) {
                case "+": answer[i] = num1 + num2 == res ? "O" : "X"; break;
                case "-": answer[i] = num1 - num2 == res ? "O" : "X"; break;
            }
        }

        return answer;
    }
}