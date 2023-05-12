import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    private static final int SIZE = 8;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test = 1; test <= 10; test++) {
            System.out.printf("#%d ", test);

            String t = br.readLine();
            List<Integer> list = new ArrayList<>(Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList()));

            while (true) {
                int i;
                for (i = 1; i <= 5; i++) {
                    int temp = list.get(0) - i;
                    if (temp <= 0) {
                        temp = 0;
                        list.remove(0);
                        list.add(temp);
                        break;
                    }
                    list.remove(0);
                    list.add(temp);
                }

                if (i != 6)
                    break;
            }

            for (int value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}