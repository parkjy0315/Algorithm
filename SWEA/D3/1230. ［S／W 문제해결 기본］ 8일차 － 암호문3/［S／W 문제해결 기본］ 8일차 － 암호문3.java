import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static void insert(List<String> cryptoList, int index, int num, String[] numArr) {
        for (int i = index; i < index + num; i++) {
            String temp = numArr[i - index];
            cryptoList.add(i, temp);
        }
    }

    public static void delete(List<String> cryptoList, int index, int num) {
        for (int i = index; i < index + num; i++) {
            cryptoList.remove(index);
        }
    }

    public static void append(List<String> cryptoList, int num, String[] numArr) {
        for(int i=0; i<num; i++) {
            String temp = numArr[i];
            cryptoList.add(temp);
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test = 1; test <= 10; test++) {
            System.out.printf("#%d ", test);

            // 입력 처리
            int N = Integer.parseInt(br.readLine());
            List<String> cryptoList = new ArrayList<>(Arrays.stream(br.readLine()
                    .split(" ")).collect(Collectors.toList()));
            int M = Integer.parseInt(br.readLine());
            List<String> commandList = new ArrayList<>(Arrays.stream(br.readLine()
                    .split(" ")).collect(Collectors.toList()));

            // 명령어 처리
            while (!commandList.isEmpty()) {
                String command = commandList.get(0);
                commandList.remove(0);

                int x, y;
                String[] s = null;
                switch (command) {
                    case "I": // 삽입
                        x = Integer.parseInt(commandList.get(0));
                        commandList.remove(0);
                        y = Integer.parseInt(commandList.get(0));
                        commandList.remove(0);
                        s = new String[y];
                        for (int i = 0; i < y; i++) {
                            s[i] = commandList.get(0);
                            commandList.remove(0);
                        }
                        insert(cryptoList, x, y, s);
                        break;
                    case "D": // 삭제
                        x = Integer.parseInt(commandList.get(0));
                        commandList.remove(0);
                        y = Integer.parseInt(commandList.get(0));
                        commandList.remove(0);

                        delete(cryptoList, x, y);
                        break;

                    case "A": // 추가
                        y = Integer.parseInt(commandList.get(0));
                        commandList.remove(0);
                        s = new String[y];
                        for (int i = 0; i < y; i++) {
                            s[i] = commandList.get(0);
                            commandList.remove(0);
                        }
                        append(cryptoList, y, s);
                        break;
                }
            }

            for (int i=0; i<10; i++)
                System.out.print(cryptoList.get(i) + " ");
            System.out.println();
        }

    }
}