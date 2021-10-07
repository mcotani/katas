package kata.problemdomain;

import java.util.HashSet;


public class User {
    // unique ID
    public final String id;
    // user name
    public final String userName;
    // password
    public String pwd;
    // set of all following;
    public HashSet<String> following;

    public User(String n, String password){
        this.userName = n;
        this.pwd = password;
        this.id = "this";
        // generate unique userID
        this.following = new HashSet<String>();
    }

    public void follow(String n){
        this.following.add(n);
    }

    public void unFollow(String n) {
        this.following.remove(n);
    }

}
