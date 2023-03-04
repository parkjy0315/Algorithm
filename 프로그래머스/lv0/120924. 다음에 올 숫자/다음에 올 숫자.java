class Solution {
    public int solution(int[] common) {
        int len = common.length;
        int dist1 = common[1] - common[0];
        int dist2 = common[2] - common[1];

        return dist1 == dist2 ? common[len - 1] + dist1 : common[len - 1] * (common[1] / common[0]);
    }
}