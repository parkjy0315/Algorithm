class Solution {
    private final int WEEK_SIZE = 7;
    
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int getPrizeCount = 0;

        for (int i = 0; i < schedules.length; i++) {
            int schedule = schedules[i];
            int hour = schedule / 100;
            int minute = schedule % 100 + 10;
            
            if (minute >= 60) {
                hour += 1;
                minute -= 60;
            }
            
            schedule = hour * 100 + minute;
            
            int count = 0;
            int day = startday;
            int[] timelog = timelogs[i];
            for (int t : timelog) {
                if (!(6 <= day && day <= 7) && t > schedule) {
                    break;
                }
                
                day = day % WEEK_SIZE + 1;
                count++;
            }
            
            if (count == timelog.length) {
                getPrizeCount++;
            }
        }
        
        return getPrizeCount;
    }
}