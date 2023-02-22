class Solution {
    public int solution(int n, int k) {
        int YKC = 12_000;
        int DRK = 2_000;
        return YKC * n + DRK * k - (n/10) * DRK;
    }
}