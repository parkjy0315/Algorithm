import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for(char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) System.out.print((char)(ch - 32));
            else System.out.print((char)(ch + 32));
        }
    }
}