class Solution {
    public int solution(String myString) {
        int answer = 0;
        
        String [] split = myString.split(" ");
        boolean operand = true;
        
        answer = Integer.parseInt(split[0]);
        for(int i=1; i<split.length - 1; i++) {
            System.out.println(split[i]);
            if(split[i].equals("+")) {
                answer += Integer.parseInt(split[i+1]);
            } else if(split[i].equals("-")) {
                answer -= Integer.parseInt(split[i+1]);
            } 
        }
        
        return answer;
    }
}