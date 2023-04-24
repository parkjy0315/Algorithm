import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int res = A * B * C;
        int[] count = new int[10];
        for (char ch : String.valueOf(res).toCharArray()) {
            int index = ch - '0';
            count[index]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}