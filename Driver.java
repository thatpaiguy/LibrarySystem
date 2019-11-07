public class Driver {
    public static void main(String args[])
    {
        UserDB list = new UserDB();
        Adult user1 = new Adult("dhruv","coding!0" , 19, "123 Street rd", "1236567890",false);
        Child user2 = new Child("nick", "imtootall@3", 43, "USC", "1234567890", user1);
        Adult user3 = new Adult("kayley", "isuckatcoding#2", 9, "hell", "6666666666", true);
        Librarian librarian = new Librarian("boss", "bequiet!0", 32, "tcoop", "9999999999", list);
        list.addUser(user1);
        list.addUser(user2);
        list.addUser(user3);
        librarian.notifyObservers("test");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.atIndex(i));
            System.out.println();
        }


    }

}
