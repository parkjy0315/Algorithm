class Solution {
    public int findLux(String[] wallpaper) {
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#')
                    return i;
            }
        }
        return 0;
    }
    public int findLuy(String[] wallpaper) {
        for (int i = 0; i < wallpaper[0].length(); i++) {
            for (int j = 0; j < wallpaper.length; j++) {
                if (wallpaper[j].charAt(i) == '#')
                    return i;
            }
        }
        return 0;
    }

    public int findRdx(String[] wallpaper) {
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            for (int j = wallpaper[0].length() - 1; j >= 0; j--) {
                if (wallpaper[i].charAt(j) == '#')
                    return i + 1;
            }
        }
        return 0;
    }

    public int findRdy(String[] wallpaper) {
        for (int i = wallpaper[0].length() - 1; i >= 0; i--) {
            for (int j = wallpaper.length - 1; j >= 0; j--) {
                if (wallpaper[j].charAt(i) == '#')
                    return i + 1;
            }
        }
        return 0;
    }

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        answer[0] = findLux(wallpaper);
        answer[1] = findLuy(wallpaper);
        answer[2] = findRdx(wallpaper);
        answer[3] = findRdy(wallpaper);

        return answer;
    }
}