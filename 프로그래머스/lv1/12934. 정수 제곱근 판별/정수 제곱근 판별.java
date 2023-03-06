class Solution {
    public long solution(long n) {
        return Math.pow(Math.ceil(Math.sqrt(n)), 2) == n ? (long)Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}