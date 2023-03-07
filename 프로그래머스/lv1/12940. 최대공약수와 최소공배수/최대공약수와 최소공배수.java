class Solution {
    public int getGcd(int a, int b) {
        if(b == 0) return a;
        else return getGcd(b, a % b);
    }

    public int getLcm(int a, int b) {
        return a * b / getGcd(a,b);
    }

    public int[] solution(int n, int m) {
        return new int[] {getGcd(n, m), getLcm(n, m)};
    }
}