import java.time.Duration;

class Solution {
    public String solution(String videoLen, String pos, String opStart, String opEnd, String[] commands) {
        Duration videoLength = parseDuration(videoLen);
        Duration currentPos = parseDuration(pos);
        Duration opStartTime = parseDuration(opStart);
        Duration opEndTime = parseDuration(opEnd);

        if (0 <= currentPos.compareTo(opStartTime) && currentPos.compareTo(opEndTime) < 0) {
            currentPos = opEndTime;
        }

        for (String command : commands) {   
            if (command.equals("prev")) {
                currentPos = currentPos.minusSeconds(10);
            }
            else if (command.equals("next")) {
                currentPos = currentPos.plusSeconds(10);   
            }

            if (currentPos.isNegative()) {
                currentPos = Duration.ZERO;
            }
            else if (currentPos.compareTo(videoLength) > 0) {
                currentPos = parseDuration(videoLen);
            }

            if (currentPos.compareTo(opStartTime) >= 0 && currentPos.compareTo(opEndTime) < 0) {
                currentPos = opEndTime;
            }
        }

        return formatDuration(currentPos);
    }

    private Duration parseDuration(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return Duration.ofMinutes(minutes).plusSeconds(seconds);
    }

    private String formatDuration(Duration duration) {
        long minutes = duration.toMinutes();
        long seconds = duration.minusMinutes(minutes).getSeconds();
        return String.format("%02d:%02d", minutes, seconds);
    }
}