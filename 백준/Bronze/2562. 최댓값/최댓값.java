import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int index = -1;
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            if (max < num) {
                max = num;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}