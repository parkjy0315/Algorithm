class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (">".equals(ineq) && "!".equals(eq) && n > m) {
            return 1;
        } else if ((">".equals(ineq) && "=".equals(eq)) && n >= m) {
            return 1;
        } else if (("<".equals(ineq) && "!".equals(eq)) && n < m) {
            return 1;
        } else if (("<".equals(ineq) && "=".equals(eq)) && n <= m) {
            return 1;
        }
        
        return 0;
    }
}