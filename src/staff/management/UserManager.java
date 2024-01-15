package staff.management;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager(){
        this.users = new ArrayList<>();

    }

    public boolean registerUser(String username, String password, String email){
        //create a new user
        if(!isEmailRegistered(email)){
            User newUser = new User(username,email,password);
            users.add(newUser);
            return true;
        }else {
            System.out.println("User is already registered");
            return false;
        }

    }

    public User logInUser(String password, String email){
        for (User user : users){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                System.out.println("Login Successfull");
                return user;
            }
        }
        System.out.println("Login failed!!");
        return null;
    }

    private boolean isEmailRegistered(String email){
        for(User user: users){
            if(user.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

}
