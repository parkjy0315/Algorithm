class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for (String g : goal) {
            if (cards1[idx1].equals(g)) {
                idx1++;
                idx1 %= cards1.length;
            } else if (cards2[idx2].equals(g)) {
                idx2++;
                idx2 %= cards2.length;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}