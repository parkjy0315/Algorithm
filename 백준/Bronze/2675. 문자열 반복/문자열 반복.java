import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test = 0; test < T; test++) {
            int R = sc.nextInt();
            String S = sc.next();

            for(String s : S.split("")) {
                System.out.print(s.repeat(R));
            }
            System.out.println();
        }
    }
}