/*
# 택배상자 트럭에 싣기
- 택배상자는 크기가 모두 같음
- 1번부터 n번까지 상자번호가 증가하는 순서대로 영재에게 전달
- 벨트에 놓인 순서대로 상자를 내릴 수 있음 (하지만 배달 순서가 달라 배달에 차질 생김)
- 보조 벨트는 스택과 같이 구성됨

# 해결방법
- 현재 택배 상자/보조 벨트 상자가 들어가야하는 순서가 아니라면 stack.push
- 더이상 stack.push 가 불가능하다면 상자를 더 이상 싣을 수 없음
*/

import java.util.*;

class Solution {
    public int solution(int[] orders) {
        Stack<Integer> assistBelt = new Stack();
        
        int answer = 0;
        for (int i = 1; i <= orders.length; i++) {
            assistBelt.push(i);
            
            while (!assistBelt.isEmpty() && orders[answer] == assistBelt.peek()) {
                answer++;
                assistBelt.pop();
            }
        }
        
        return answer;
    }
}