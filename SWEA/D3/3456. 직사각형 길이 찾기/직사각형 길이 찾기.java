
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for(int value : arr) {
                map.put(value, map.getOrDefault(value, 0) + 1);
            }

            System.out.printf("#%d ", test);
            for(int key : map.keySet()) {
                if (map.get(key) % 2 == 1)
                    System.out.println(key);
            }
        }
    }
}

