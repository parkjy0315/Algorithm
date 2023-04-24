import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        List<String> alphabet = new ArrayList<>() {{
            add("c=");
            add("c-");
            add("dz=");
            add("d-");
            add("lj");
            add("nj");
            add("s=");
            add("z=");
        }};

        for (int i=0; i<alphabet.size(); i++) {
            String ch = alphabet.get(i);
            input = input.replaceAll(ch, String.valueOf(i));
        }

        System.out.println(input.length());
    }
}