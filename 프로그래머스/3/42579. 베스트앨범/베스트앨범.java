// 장르 별 가장 많이 재생된 노래 2개씩 => 베스트 앨범 출시
// 노래 수록 기준
// 1. 속한 노래가 많이 재생된 장르를 먼저 수록
// 2. 장르 내에서 많이 재생된 노래를 먼저 수록
// 3. 장르 내에서 재생 횟수가 같은 노래 중 고유 번호가 낮은 노래를 먼저 수록
import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> playMap = new HashMap<>();
        Map<String, List<SongData>> genreMap = new HashMap<>();
        
        for (int i = 0; i < plays.length; i++) {
            playMap.put(genres[i], playMap.getOrDefault(genres[i], 0) + plays[i]);
            List<SongData> list = genreMap.getOrDefault(genres[i], new ArrayList<>());
            list.add(new SongData(i, plays[i]));
            genreMap.put(genres[i], list);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(playMap.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : list) {
            List<SongData> temp = genreMap.get(pair.getKey());
            Collections.sort(temp);
            for (int i = 0; i < Math.min(temp.size(), 2); i++) {
                result.add(temp.get(i).index);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

class SongData implements Comparable<SongData> {
    int index;
    int plays;

    public SongData(int index, int plays) {
        this.index = index;
        this.plays = plays;
    }
    
    public int compareTo(SongData songData) {
        return songData.plays - plays;
    }
}