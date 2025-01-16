import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        Queue<int[]> attackStack = new LinkedList<>(Arrays.asList(attacks));

        int castingTime = bandage[0];
        int healAmount = bandage[1];
        int additionalHeal = bandage[2];

        int answer = health;
        int healingTime = 0;
        int time = 1;

        int[] attack = attackStack.poll();
        while(true) {
            if (answer <= 0) {
                break;
            }

            if (attack[0] == time) {
                answer -= attack[1];
                attack = attackStack.poll();
                if (attack == null) {
                    break;
                }
                healingTime = 0;
                time++;
                continue;
            }

            answer = healAmount + answer > health ? health : healAmount + answer;
            healingTime++;

            if (healingTime >= castingTime) {
                answer = additionalHeal + answer > health ? health : additionalHeal + answer;
                healingTime = 0;
            }
            
            time++;
        }
        System.out.println("answer = " + answer);   

        return answer > 0 ? answer : -1;
    }
}