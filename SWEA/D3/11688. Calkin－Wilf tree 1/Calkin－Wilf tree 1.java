import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    static class Node {
        private int a;
        private int b;

        public Node(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public String toString() {
            return a + " " + b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            String input = br.readLine();

            Node current = new Node(1, 1);
            Node newNode = null;

            for (char ch : input.toCharArray()) {
                int a = current.getA();
                int b = current.getB();

                switch (ch) {
                    case 'L':
                        newNode = new Node(a, a + b);
                        break;

                    case 'R':
                        newNode = new Node(a + b, b);
                        break;
                }
                current = newNode;
            }

            System.out.printf("#%d ", test);
            System.out.println(current);
        }
    }
}