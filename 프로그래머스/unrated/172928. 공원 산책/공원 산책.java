class Solution {
    private int HEIGHT;
    private int WIDTH;

    public int[] findStart(String[] park) {
        int[] pos = new int[2];
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }
            }
        }
        return pos;
    }

    public boolean moveCheck(String[] park, int x, int y) {
        return !(x < 0 || y < 0 || y >= WIDTH || x >= HEIGHT || park[x].charAt(y) == 'X');
    }

    public int[] solution(String[] park, String[] routes) {
        this.WIDTH = park[0].length();
        this.HEIGHT = park.length;
        int[] answer = findStart(park);
        for(String route : routes) {
            String[] split = route.split(" ");
            int move = Integer.parseInt(split[1]);
            int newX = answer[0];
            int newY = answer[1];
            int i;
            for(i=0; i<move; i++) {
                switch(split[0]) {
                    case "E":
                        newY += 1;
                        break;
                    case "W":
                        newY -= 1;
                        break;
                    case "S":
                        newX += 1;
                        break;
                    case "N":
                        newX -= 1;
                        break;
                }
                if(!moveCheck(park, newX, newY)) {
                    break;
                }
            }
            if (i == move) {
                answer[0] = newX;
                answer[1] = newY;
            }
        }

        return answer;
    }
}
