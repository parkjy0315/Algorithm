import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private final static int SIZE = 10;
    private final static int DIVIDOR = 42;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remain = new int[DIVIDOR];

        for(int i=0; i<SIZE; i++) {
            int index = Integer.parseInt(br.readLine()) % DIVIDOR;
            remain[index]++;
        }

        System.out.println(Arrays.stream(remain).filter(i -> i != 0).count());
    }
}