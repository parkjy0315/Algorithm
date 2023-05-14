import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("MON", 6);
            put("TUE", 5);
            put("WED", 4);
            put("THU", 3);
            put("FRI", 2);
            put("SAT", 1);
            put("SUN", 7);
        }};

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            // 입력
            String input = br.readLine();


            System.out.printf("#%d ", test);
            System.out.println(map.get(input));
        }
    }
}

