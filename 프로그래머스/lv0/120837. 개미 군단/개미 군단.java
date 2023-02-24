class Solution {
    public int solution(int hp) {
        int [] dmg = {5, 3, 1};
        int answer = 0;
        
        for(int d : dmg) {
            answer += (int)(hp / d);
            hp %= d;
        }
        return answer;
    }
}