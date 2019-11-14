import java.util.LinkedList;

//add new copy of book to item DB
//can view profiles
//TODO comments about observers
public class Librarian extends User {
    public Librarian(String userName, String password, int age, String address, String phoneNumb) {
        super(userName, password, age, address, phoneNumb);
    }

    public void notifyObservers(LinkedList<User> list, String notice) {
        for(int i =0; i<list.size(); i++) {
            list.get(i).update(notice);
        }
    }
    public String toString(){
        return super.toString() + "Librarian";
    }
    public String getType(){
        return "Librarian";
    }


}
