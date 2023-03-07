import java.util.stream.*;

class Solution {
    public long solution(int price, int money, int count) {
        long total = LongStream.rangeClosed(1, count).map(i -> i * price).sum();
        return total <= money ? 0 : total - money;
    }
}
