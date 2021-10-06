package kata.problemdomain;
import java.util.HashSet;


public class User {
    // unique ID
    String id;
    // user name
    String name;
    // set of all following;
    HashSet<String> following;

    public User(String n){
        name = n;
        // generate unique userID
        following = new HashSet<String>();
    }

    public void follow(String n){
        this.following.add(n);
    }

    public void unFollow(String n){
        this.following.remove(n);
    }
}
