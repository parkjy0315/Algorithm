class Solution {
    public int solution(int a, int b) {
        int temp1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int temp2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return temp1 >= temp2 ? temp1 : temp2;
    }
}