class Solution {
    private static final int SIZE = 5;
    public static void main(String args[]) throws Exception {
        for (int i = 0; i < SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (i == j) System.out.print("#");
                else System.out.print("+");
            }
            System.out.println();
        }
    }
}