import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (char ch : a.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                System.out.print((char)(ch + 32));
            }
            else if ('a' <= ch && ch <= 'z') {
                System.out.print((char)(ch - 32));
            }
        }
    }
}