//add new copy of book to item DB
//can view profiles
//TODO comments about observers
public class Librarian extends User {
    private UserDB observers;
    public Librarian(String userName, String password, int age, String address, String phoneNumb, UserDB userdb) {
        super(userName, password, age, address, phoneNumb);
        observers = userdb;
    }

    public void notifyObservers(String notice) {
        for(int i =0; i<observers.size(); i++) {
            observers.atIndex(i).update(notice);
        }
    }
    public void addItem(Item item){
        //TODO adds item to ItemDB
    }

}
