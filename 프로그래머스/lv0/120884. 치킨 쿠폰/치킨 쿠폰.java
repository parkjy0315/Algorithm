class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int amount = coupon / 10;
        int answer = amount;
        coupon = coupon % 10 + amount;
        
        while(coupon > 10) {
            amount = coupon / 10;
            answer += amount;
            coupon = coupon % 10 + amount;
        }
        
        amount = coupon / 10;
        answer += amount;
        coupon = coupon % 10 + amount;
        return answer;
    }
}