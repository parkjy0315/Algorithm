class Solution {
    public int getGcd(int a, int b) {
        if (b == 0) return a;
        else return getGcd(b, a % b);
    }

    public int getLcm(int a, int b) {
        return a * b / getGcd(a, b);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = getLcm(denom1, denom2);
        int numer = numer1 * lcm / denom1 + numer2 * lcm / denom2;
        int gcd = getGcd(lcm, numer);
        return new int[] {numer / gcd, lcm / gcd};
    }

}