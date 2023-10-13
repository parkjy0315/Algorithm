import java.util.*;

class UserInfo {
    String userId;
    String nickName;
    
    public UserInfo(String userId, String nickName) {
        this.userId = userId;
        this.nickName = nickName;
    }
}

class Event {
    String eventName;
    UserInfo userInfo;
    
    public Event(String eventName, UserInfo userInfo) {
        this.eventName = eventName;
        this.userInfo = userInfo;
    }
}

class Solution {
    public List<String> solution(String[] records) {
        List<Event> eventList = new ArrayList<>();
        Map<String, UserInfo> userMap = new HashMap<>();
        
        for (String record : records) {
            String[] split = record.split(" ");
            String userId = split[1];
            
            UserInfo userInfo = userMap.get(userId);
            if (split[0].equals("Enter")) {
                if (userInfo == null) {
                    userInfo = new UserInfo(userId, split[2]);
                    userMap.put(userId, userInfo);
                } else {
                    userInfo.nickName = split[2];
                }
                Event event = new Event("Enter", userInfo);
                eventList.add(event);
            }
            else if (split[0].equals("Leave")) {
                Event event = new Event("Leave", userInfo);
                eventList.add(event);
            } else if (split[0].equals("Change")) {
                userInfo.nickName = split[2];
            }
        }
        
        List<String> result = new ArrayList<>();
        for (Event event : eventList) {
            String temp = String.format("%s님이 ", event.userInfo.nickName);
            
            if (event.eventName.equals("Enter")) {
                temp += "들어왔습니다.";
            } else if (event.eventName.equals("Leave")) {
                temp += "나갔습니다.";
            }
            
            result.add(temp);
        }

        return result;
    }
}