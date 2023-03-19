import java.util.*;
import java.util.stream.*;

class Solution {
    public int getWinNum(int answer) {
        switch(answer) {
            case 0:
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
        }
        return 0;
    }
    public int[] solution(int[] lottos, int[] winNums) {
        List<Integer> myList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> winList = Arrays.stream(winNums).boxed().collect(Collectors.toList());
        int zeroCnt = (int)myList.stream().filter(i -> i == 0).count();
        int count = (int)myList.stream().filter(winList::contains).count();

        return new int[] {getWinNum(count + zeroCnt), getWinNum(count)};
    }
}