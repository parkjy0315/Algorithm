class Solution {
    public int solution(String skill, String[] skillTrees) {
        int answer = 0;
        
        for (String skillTree : skillTrees) {
            int size = skillTree.length();
            int idx = 0, i;
            
            for (i = 0; i<size; i++) {
                char current = skillTree.charAt(i);
                if (skill.contains(String.valueOf(current))) {
                    if (current != skill.charAt(idx)) {
                        break;
                    } else {
                        idx++;
                    }
                }
            }
            
            if (i == size) {
                answer++;
            }
        }
        
        return answer;
    }
}