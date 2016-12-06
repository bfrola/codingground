import java.util.*;
import java.lang.*;
import java.io.*;

public class HelloWorld{

     public static void main(String []args){
        class User {
            private final int id;
            public User (int id) {
                this.id = id;   
            }
            public int getId() { return id; }
            public String toString() { return "User with ID = " + id; }
        }
        
        List<User> users = Arrays.asList(new User(55), new User(22), new User(777));
        System.out.println("List of users:");
        users.forEach(System.out::println);
        
        String result = users.stream()
            .map(u -> Integer.toString(u.getId()))
            .reduce("", String::concat);
            
        System.out.println("Concatenated IDs: " + result);
     }
}
