import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<String> dict = new ArrayList<>() {{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
            add("F");
            add("G");
            add("H");
            add("I");
            add("J");
            add("K");
            add("L");
            add("M");
            add("N");
            add("O");
            add("P");
            add("Q");
            add("R");
            add("S");
            add("T");
            add("U");
            add("V");
            add("W");
            add("X");
            add("Y");
            add("Z");
        }};

        List<Integer> result = new ArrayList<>();
        String[] stringArr = msg.split("");

        int i = 0;
        while (i < stringArr.length) {
            String w = stringArr[i];

            int pre = dict.indexOf(w);
            for (int j = 1; j < stringArr.length - i; j++) {
                String c = stringArr[i + j];
                String temp = w + c;
                int index = dict.indexOf(temp);
                if (index == -1) {
                    dict.add(temp);
                    break;
                }
                pre = index;
                w = temp;
            }

            result.add(pre + 1);
            i += w.length();
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}