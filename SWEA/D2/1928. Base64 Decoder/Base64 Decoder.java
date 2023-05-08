import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("A", 0); put("Q", 16); put("g", 32); put("w", 48);
        put("B", 1); put("R", 17); put("h", 33); put("x", 49);
        put("C", 2); put("S", 18); put("i", 34); put("y", 50);
        put("D", 3); put("T", 19); put("j", 35); put("z", 51);
        put("E", 4); put("U", 20); put("k", 36); put("0", 52);
        put("F", 5); put("V", 21); put("l", 37); put("1", 53);
        put("G", 6); put("W", 22); put("m", 38); put("2", 54);
        put("H", 7); put("X", 23); put("n", 39); put("3", 55);
        put("I", 8); put("Y", 24); put("o", 40); put("4", 56);
        put("J", 9); put("Z", 25); put("p", 41); put("5", 57);
        put("K", 10); put("a", 26); put("q", 42); put("6", 58);
        put("L", 11); put("b", 27); put("r", 43); put("7", 59);
        put("M", 12); put("c", 28); put("s", 44); put("8", 60);
        put("N", 13); put("d", 29); put("t", 45); put("9", 61);
        put("O", 14); put("e", 30); put("u", 46); put("+", 62);
        put("P", 15); put("f", 31); put("v", 47); put("/", 63);
    }};
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            System.out.printf("#%d ", test);

            String [] inputArr = br.readLine().split("");
            StringBuilder sb = new StringBuilder();
            // 맵(표)을 기준으로 모든 값을 나열
            for(String input : inputArr) {
                sb.append(
                    String.format("%6s",
                        Integer.toBinaryString(map.get(input)))
                        .replace(" ", "0")
                );
            }

            while (!sb.toString().equals("")) {
                String temp = sb.substring(0, 8);
                sb = new StringBuilder(sb.substring(8));
                System.out.print((char)(Integer.parseInt(temp, 2)));
            }
            System.out.println();
        }
    }
}
