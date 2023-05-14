import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static boolean remove(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);
            if (current == next) {
                list.remove(i);
                list.remove(i);

                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test = 1; test <= 10; test++) {
            System.out.printf("#%d ", test);

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            String password = st.nextToken();

            List<Integer> list = new ArrayList<>(
                    password.chars()
                            .map(ch -> ch - '0')
                            .boxed()
                            .collect(Collectors.toList()));

            while (remove(list));

            password = String.join("",
                    list.stream()
                            .map(n -> String.valueOf(n))
                            .toArray(String[]::new));

            System.out.println(password);
        }
    }
}

