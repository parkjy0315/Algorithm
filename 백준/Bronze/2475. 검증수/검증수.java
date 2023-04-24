import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        System.out.println(
                Arrays.stream(input)
                        .mapToInt(Integer::parseInt)
                        .map(i -> i * i)
                        .sum() % 10
        );
    }
}