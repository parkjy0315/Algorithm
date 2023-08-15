import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String word = br.readLine();

        int count = 0;
        for (char ch : word.toCharArray()) {
            bw.write(ch);
            count++;
            
            if (count % 10 == 0) {
                bw.write("\n");
            }
        }

        bw.close();
        br.close();
    }
}