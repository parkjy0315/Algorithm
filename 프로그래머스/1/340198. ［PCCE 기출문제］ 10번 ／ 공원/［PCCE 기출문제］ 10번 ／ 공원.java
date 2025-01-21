import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        int length = mats.length;
        
        for (int i = length - 1; i >= 0; i--) {
            int matLength = mats[i];
            
            for (int x = 0; x < park.length; x++) {
                for (int y = 0; y < park[x].length; y++) {
                    boolean canPlace = true;
                    
                    for (int j = x; j < x + matLength; j++) {
                        if (j >= park.length) {
                            canPlace = false;
                            break;
                        }

                        if (!canPlace) {
                            break;
                        }

                        for (int k = y; k < y + matLength; k++) {
                            if (k >= park[j].length) {
                                canPlace = false;
                                break;
                            }
                            
                            if (!park[j][k].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                    }

                    if (canPlace) {
                        return matLength;
                    }
                }
            }
        }
        
        return -1;
    }
}