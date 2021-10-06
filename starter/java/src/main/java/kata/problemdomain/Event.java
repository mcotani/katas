package kata.problemdomain;

import java.util.Date;

public class Event {
    // content of the post
        public static String content;
        // timestamp
        public Date ts;
        // unique userID
        public static String user;
        
        public Event(String c, String u){
            this.content = c;
            this.ts = new Date(System.currentTimeMillis());
            this.user = u;
        }

}
