class Solution {
    private int[][] pos = {
            {3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0},
            {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}
    };

    public int calcDistance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[] leftPos = {3, 0};
        int[] rightPos = {3, 2};

        for (int n : numbers) {
            switch (n) {
                case 1: case 4: case 7:
                    leftPos = pos[n];
                    answer.append("L");
                    break;
                case 3: case 6: case 9:
                    rightPos = pos[n];
                    answer.append("R");
                    break;
                case 2: case 5: case 8: case 0:
                    double left = calcDistance(leftPos, pos[n]);
                    double right = calcDistance(rightPos, pos[n]);
                    if (left < right) {
                        leftPos = pos[n];
                        answer.append("L");
                    } else if (left > right) {
                        rightPos = pos[n];
                        answer.append("R");
                    } else {
                        if (hand.equals("right")) {
                            rightPos = pos[n];
                            answer.append("R");
                        } else {
                            leftPos = pos[n];
                            answer.append("L");
                        }
                    }
                    break;
            }
        }

        return answer.toString();
    }
}