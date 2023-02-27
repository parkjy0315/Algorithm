class Solution {
    public int solution(int order) {
        return (int)String.valueOf(order).chars()
            .filter(i -> (int)(i) % 3 == 0 && i != '0').count();
    }
}