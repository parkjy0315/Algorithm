class Solution {
    public int solution(int n) {
        int pizza = 1;
        while(n > 7) {
            n -= 7;
            pizza++;
        }
        return pizza;
    }
}