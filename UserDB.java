/**
 * This is the database of all the accounts in the system
 * Uses methods from LinkedList package
 * before adding a user, it checks if the username is already in the system
 */
import java.util.*;
public class UserDB {
    LinkedList<User> list;
    public UserDB(){
        list = new LinkedList<User>();
    }
    public void addUser(User user){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getUsername().equals(user.getUsername())){
                System.out.println("An account with this username already exists");
                return;
            }
        }
        list.add(user);
    }
    public void removeUser(User user){
        if(list.contains(user))
            list.remove(user);
        else
            System.out.println("This account doesn't exist");
    }
    public User atIndex(int i){
        if(i>list.size()){
            System.out.println("This index is greater than the database size");
            return null;
        }
        return list.get(i);
    }
    public int size(){
        return list.size();
    }
}
