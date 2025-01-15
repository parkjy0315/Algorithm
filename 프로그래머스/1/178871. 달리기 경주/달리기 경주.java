import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankingMap = new HashMap<>();

        int rank = 0;
        for (String player : players) {
            rankingMap.put(player, rank++);
        }

        for (String calling : callings) {
            int currentRank = rankingMap.get(calling);

            String frontPlayer = players[currentRank - 1];
            
            rankingMap.put(calling, currentRank - 1);
            rankingMap.put(frontPlayer, currentRank);

            players[currentRank - 1] = calling;
            players[currentRank] = frontPlayer;
        }

        return players;
    }
}