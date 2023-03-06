class Solution {
    public int getGcd(int a, int b) {
        if (b == 0) return a;
        else return getGcd(b, a % b);
    }

    public boolean equals(int[] dot1, int[] dot2) {
        int gcd1 = getGcd(dot1[0], dot1[1]);
        int gcd2 = getGcd(dot2[0], dot2[1]);
        dot1[0] /= gcd1; dot1[1] /= gcd1;
        dot2[0] /= gcd2; dot2[1] /= gcd2;
        
        return dot1[0] == dot2[0] && dot1[1] == dot2[1] ? true : false;
    }
    public int solution(int[][] dots) {
        int [] dot = dots[0];
        for(int i=1; i<4; i++) {
            int [][] vectors = new int[2][2];
            switch(i) {
                case 1:
                    vectors[0][0] = dots[i][0] - dot[0];
                    vectors[0][1] = dots[i][1] - dot[1];
                    vectors[1][0] = dots[2][0] - dots[3][0];
                    vectors[1][1] = dots[2][1] - dots[3][1];
                    if (equals(vectors[0], vectors[1]))
                        return 1;
                    break;
                case 2:
                    vectors[0][0] = dots[i][0] - dot[0];
                    vectors[0][1] = dots[i][1] - dot[1];
                    vectors[1][0] = dots[1][0] - dots[3][0];
                    vectors[1][1] = dots[1][1] - dots[3][1];
                    if (equals(vectors[0], vectors[1]))
                        return 1;
                    break;
                case 3:
                    vectors[0][0] = dots[i][0] - dot[0];
                    vectors[0][1] = dots[i][1] - dot[1];
                    vectors[1][0] = dots[1][0] - dots[2][0];
                    vectors[1][1] = dots[1][1] - dots[2][1];
                    if (equals(vectors[0], vectors[1]))
                        return 1;
                    break;
            }
        }

        return 0;
    }
}