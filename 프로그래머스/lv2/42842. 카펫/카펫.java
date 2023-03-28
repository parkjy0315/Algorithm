class Solution {
    public int[] solution(int brown, int yellow) {
        // 갈색 가로 = 노랑 가로 + 2
        // 갈색 세로 = 노랑 세로 + 2
        // 갈색 + 노랑 = 갈색 가로 * 갈색 세로
        // 노랑 = 노랑가로 * 노랑세로
        // brown + yellow = (노랑가로 + 2) * (노랑세로 + 2) = 노랑 + 2 * 노가 + 2 * yellow / 노가 + 4
        int row = (int) (((brown - 4) + Math.sqrt(Math.pow(brown - 4, 2) - 16 * yellow)) / 4);
        int col = (int) (((brown - 4) - Math.sqrt(Math.pow(brown - 4, 2) - 16 * yellow)) / 4);
        return new int[]{row + 2, col + 2};
    }
}