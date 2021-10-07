package kata;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import kata.problemdomain.User;

public class TwotterApplication {
    private static String getUserName(String text){
        String username = null;
        System.out.println(text);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            username = br.readLine();
        } 
        catch (IOException e) {
            System.out.println("Error reading username.");
            System.exit(1);
        }
        return username;
    }

    private static boolean newUserPrompt(String text){
        String response = null;
        System.out.println(text);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = br.readLine();
        } 
        catch (IOException e) {
            System.out.println("Error reading response.");
            System.exit(1);
        }
        if (response.equals("y")){
            return true;
        }
        return false;
    }


    private static String getPassword(String text){
        String pwd = null;
        System.out.println(text);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            pwd = br.readLine();
        } 
        catch (IOException e) {
            System.out.println("Error reading password.");
            System.exit(1);
        }
        return pwd;
    }

    public static void main(String[] args){
        String name = "";
        String pwd = "";
        if (newUserPrompt("First time logging in? (y/n): ")){
            name = getUserName("Please choose your unique username: ");
            pwd = getPassword("Please set a password: ");
            
        } else{
            name = getUserName("Username: ");
            pwd = getPassword("Password: ");
        }
        Event e = new Event("n0k", "id");
        User n = new User(name, pwd);
        System.out.println(e.content);
        System.out.println(n);
        
    }
}
