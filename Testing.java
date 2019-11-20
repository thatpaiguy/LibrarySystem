import java.util.ArrayList;
import java.util.LinkedList;

public class Testing {

    public static void JSONTest() {
        /**
         * Testing the JSON parse of books into an ArrayList
         */
        ItemConnect itemConnect = ItemConnect.getInstance();
        ArrayList<Book> BookLists = itemConnect.getBookList();
        for (Book books : BookLists) {
            System.out.println("ID: " + books.getId() + "\n Title: " + books.getTitle() + "\n Year: " + books.getYear() + "\n Genre: " + books.getGenre() +
                    "\n Number of Copies: " + books.getNumCopies() + "\n New Arrival: " + books.isNewArrival() + "\n Book is checked out: " + books.isCheckedOut() +
                    "\n ISBN: " + books.getISBN() + "\n Publisher: " + books.getPublisher() + "\n Author: " + books.getAuthor() + "\n Condition: " +
                    books.getCondition());
        }

        /**
         * Testing the JSON Parse of Magazines into an ArrayList
         */
        ArrayList<Magazine> MagLists = itemConnect.getMagList();
        for (Magazine mags : MagLists) {
            System.out.println("ID: " + mags.getId() + "\n Title: " + mags.getTitle() + "\n Year: " + mags.getYear() + "\n Genre: " + mags.getGenre() +
                    "\n Number of Copies: " + mags.getNumCopies() + "\n New Arrival: " + mags.isNewArrival() + "\n Book is checked out: " + mags.isCheckedOut() +
                    "\n Publisher: " + mags.getPublisher() + "\n Volume: " + mags.getVolume() + "\n Issue: " + mags.getIssue() + "\n Condition: " + mags.getCondition());

        }

        /**
         * Testing the JSONParse of DVDs into an ArrayList
         */
        ArrayList<DVD> DVDLists = itemConnect.getDvdList();
        for (DVD dvds : DVDLists) {
            System.out.println("ID: " + dvds.getId() + "\n Title: " + dvds.getTitle() + "\n Year: " + dvds.getYear() + "\n Genre: " + dvds.getGenre() +
                    "\n Number of Copies: " + dvds.getNumCopies() + "\n New Arrival: " + dvds.isNewArrival() + "\n DVD is checked out: " + dvds.isCheckedOut() +
                    "\n Director: " + dvds.getDirector() + "\n Actor(s): " + dvds.getActors());
        }
    }

    public static void adultTest() {
        Adult Nick = new Adult("Nick", "Hello!23", 20, "lemon lane", "1234567890", false);
        Nick.update("Testing Update");



        /**
         * Loads the Linked Lists
         */
        LinkedList<Item> itemDB = new LinkedList<>();
        ItemConnect itemConnect = ItemConnect.getInstance();
        for (Book book : itemConnect.getBookList()) itemDB.add(book);
        for (Magazine magazine : itemConnect.getMagList()) itemDB.add(magazine);
        for (DVD dvd : itemConnect.getDvdList()) itemDB.add(dvd);

        /**
         * Should say successful checkout
         */
        String title = "The Cat in the Hat";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nick.checkOut(itemDB.get(i));
            }
        }

        /**
         * Should not say anything if it doesn't work
         */
        title = "Should be invalid input";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nick.checkOut(itemDB.get(i));
            }
        }
        /**
         * Should add to the waitlist
         */
        title = "To Kill a Mockingbird";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nick.checkOut(itemDB.get(i));
            }
        }

        /**
         * Should not allow checkout because of balance
         */
        Nick.addBalance(101);
        title = "The Cat in the Hat";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nick.checkOut(itemDB.get(i));
            }
        }

        /**
         * Should not allow a checkout after 10
         */
        title = "The Cat in the Hat";
        for(int j = 0; j < 10;j++) {
            for (int i = 0; i < itemDB.size(); i++) {
                if (itemDB.get(i).getTitle().equals(title)) {
                    Nick.checkOut(itemDB.get(i));
                }
            }
        }
    }

    public static void childTest() {
        Adult Nick = new Adult("Nick", "Hello!23", 20, "lemon lane", "1234567890", false);
        Child Nicky = new Child("nicky", "little!232", 9, "Lemond lane","0987654321", Nick);

        LinkedList<Item> itemDB = new LinkedList<>();
        ItemConnect itemConnect = ItemConnect.getInstance();
        for (Book book : itemConnect.getBookList()) itemDB.add(book);
        for (Magazine magazine : itemConnect.getMagList()) itemDB.add(magazine);
        for (DVD dvd : itemConnect.getDvdList()) itemDB.add(dvd);

        /**
         * Shows the info of the child's parent
         */
        System.out.println("Parent is: \n"+Nicky.getParent()+"\n");

        /**
         * Checks for Mature rating and doesn't let a child checkout
         */
        String title = "Gone With the Wind";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nicky.checkOut(itemDB.get(i));
            }
        }
        /**
         * Should successfully checkout
         */
        title = "The Cat in the Hat";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nicky.checkOut(itemDB.get(i));
            }
        }
        /**
         * Should add to the waitlist
         */
        title = "To Kill a Mockingbird";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nicky.checkOut(itemDB.get(i));
            }
        }
        /**
         * Should not allow too many checkouts
         */
        title = "The Cat in the Hat";
        for(int j = 0; j < 10;j++) {
            for (int i = 0; i < itemDB.size(); i++) {
                if (itemDB.get(i).getTitle().equals(title)) {
                    Nicky.checkOut(itemDB.get(i));
                }
            }
        }
        /**
         * Trying to pay fines
         */
        Nicky.payFine();

        /**
         * Testing update
         */
        Nicky.update("Testing Update");
    }

    public static void itemTest() {
        LinkedList<Item> itemDB = new LinkedList<>();
        ItemConnect itemConnect = ItemConnect.getInstance();
        for (Book book : itemConnect.getBookList()) itemDB.add(book);
        for (Magazine magazine : itemConnect.getMagList()) itemDB.add(magazine);
        for (DVD dvd : itemConnect.getDvdList()) itemDB.add(dvd);
        Adult Nick = new Adult("Nick", "Hello!23", 20, "lemon lane", "1234567890", false);

        /**
         * Item class adds the user to the waitlist
         */
        String title = "To Kill a Mockingbird";
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                Nick.checkOut(itemDB.get(i));
            }
        }
        /**
         * Adds a rating
         */
        double newStars = 4.5;
        String newRating1 = "I absolutely adore this book. Almost five stars :)";
        Rating startRating = new Rating(newStars,newRating1);

        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                itemDB.get(i).addRating(startRating);
                System.out.println("Added Rating");
            }
        }

        /**
         * Should get Ratings list
         */
        for (int i = 0; i < itemDB.size(); i++) {
            if (itemDB.get(i).getTitle().equals(title)) {
                System.out.println(itemDB.get(i).getRatingList());
            }
        }

    }

    public static void librarianTest() {
        LinkedList<User> userDB = new LinkedList<>();
        LinkedList<Item> itemDB = new LinkedList<>();
        ItemConnect itemConnect = ItemConnect.getInstance();
        for (Book book : itemConnect.getBookList()) itemDB.add(book);
        for (Magazine magazine : itemConnect.getMagList()) itemDB.add(magazine);
        for (DVD dvd : itemConnect.getDvdList()) itemDB.add(dvd);

        /**
         * Adding people to the user database
         */
        Adult Nicky = new Adult("Nicky", "Hello!23", 20, "lemon lane", "1234567890", false);
        Librarian Nick = new Librarian("Nick", "Hello!23",20,"Lemon lane", "1234567899");
        userDB.add(Nick);
        userDB.add(Nicky);

        /**
         * The Librarian "Nick" should tell the adult "Nicky" that their book is ready
         */
        Nick.notifyObservers(userDB,"Your book is ready");
    }

    public static void userTest() {
        /**
         * Testing instantiating adult, teacher, child and toString
         */
        Adult adult = new Adult("Dhruv", "passw0rd!", 20, "tcoop","7049047233", false);
        Adult adult2 = new Adult("Dhruv Teacher", "passw0rd!", 20, "tcoop","7049047233", true);
        Child child = new Child("Dhruv Child", "passw0rd!", 13, "tcoop","7049047233", adult);
        System.out.println(adult);
        System.out.println(adult2);
        System.out.println(child);

        /**
         * testing set methods that have internal conditions
         */
        adult.setPassword("123");
        System.out.println(adult.getPassword());

        adult.setPhoneNumb("1");
        System.out.println(adult.getPhoneNumb());

        /**
         * testing check out method
         */
        Book book = new Book("1", "book", "1999", "fiction" , 3, false, false , "12344", "dhruv", "pai", "used", false, 4);
        

    }

    public static void main(String[] args) {

        System.out.println("\nJSON Parse Testing: \n");
        JSONTest();
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Adult Class Testing: \n");
        adultTest();
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Child Class Testing: \n");
        childTest();
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Item Class Testing: \n");
        itemTest();
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Librarian Class Testing: \n");
        librarianTest();
    }
}