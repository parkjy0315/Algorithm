class Solution {
    public int getDivisorCount(int num) {
        int count = 1;
        for(int i=1; i<=num / 2; i++) {
            if (num % i == 0)
                count++;
        }

        return count;
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            int count = getDivisorCount(i);
            answer += count > limit ? power : count;
        }
        return answer;
    }
}