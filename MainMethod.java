import java.util.LinkedList;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LinkedList<User> userDB = new LinkedList<>();
        LinkedList<Item> itemDB = new LinkedList<>();
        ItemConnect itemConnect = ItemConnect.getInstance();
        for (Book book : itemConnect.getBookList()) itemDB.add(book);
        for (Magazine magazine : itemConnect.getMagList()) itemDB.add(magazine);
        for (DVD dvd : itemConnect.getDvdList()) itemDB.add(dvd);
        double newStars = 4.5;
        String newRating1 = "I absolutely adore this book. Almost five stars :)";
        Rating startRating = new Rating(newStars,newRating1);
        boolean quit = false;
        Librarian librarian = new Librarian("shelly", "p@ssw0rd", 20, "Tcoop", "1234567890");
        userDB.add(librarian);
        while (!quit) {
            System.out.println("Welcome to the Screaming Gophers Library! Would you like to \nCreate an Account(type '1')\nLogin (type '2') \nExit (type'3'");
            int input = keyboard.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter an original username");
                    String name = keyboard.nextLine();
                    keyboard.nextLine();
                    System.out.println("Enter a password with at least 8 characters, 1 number, and 1 special character");
                    String pw = keyboard.nextLine();
                    System.out.println("Enter your address");
                    String addy = keyboard.nextLine();
                    System.out.println("Enter your 10 digit phone number");
                    String number = keyboard.nextLine();
                    System.out.println("Enter your age");
                    int age = keyboard.nextInt();
                    if (age >= 5 && age <= 16) {
                        System.out.println("You are a child, who is your parent");
                        String parentName = keyboard.nextLine();
                        keyboard.nextLine();
                        for (int i = 0; i < userDB.size(); i++) {
                            if (userDB.get(i).getUsername().equals(parentName)) {
                                userDB.add(new Child(name, pw, age, addy, number, userDB.get(i)));
                                break;
                            }
                        }
                    }
                    if (age > 16) {
                        System.out.println("Congrats you are an Adult. Are you a teacher? Enter true for yes, false for no");
                        boolean teach = keyboard.nextBoolean();
                        userDB.add(new Adult(name, pw, age, addy, number, teach));
                    }
                    //break;
                case 2:
                    User account = new Adult();
                    System.out.println("Enter your username and password");
                    String lName = keyboard.nextLine();
                    String lpw = keyboard.nextLine();
                    keyboard.nextLine();
                    for (int i = 0; i < userDB.size(); i++) {
                        if (userDB.get(i).getUsername().equals(lName) && userDB.get(i).getPassword().equals(lpw)) {
                            account = userDB.get(i);
                            System.out.println("Hey " + userDB.get(i).getUsername()+"!");
                            break;
                        }
                    }

                    boolean quit2 = false;
                    while (!quit2) {
                        System.out.println("Would you like to check out a book, DVD, or Magazine (1), pay fines (2), leave a rating (3), or log out (4)");
                        if (account.getType().equals("Librarian"))
                            System.out.println("\nOr Librarian functions: \nAdd book (6) \nRemove Book (7) \nAlert user (8)");
                        switch (keyboard.nextInt()) {
                            case 1:
                                System.out.println("Enter the name of the book, DVD, or Magazine you want");
                                keyboard.nextLine();
                                String title = keyboard.nextLine();
                                for (int i = 0; i < itemDB.size(); i++) {
                                    if (itemDB.get(i).getTitle().equals(title)) {
                                        account.checkOut(itemDB.get(i));
                                        break;
                                    }
                                }
                                break;
                            case 2://TODO
                                for (int i = 0; i < account.itemSize(); i++) {
                                    System.out.println("How many days have you had " + account.getItems(i).getTitle());
                                    int days = keyboard.nextInt();
                                    if (days > account.getItems(i).getDueDate())
                                        account.addBalance(days * .01);
                                }
                                System.out.println("Your balance is " + account.getBalance() + "\nHow much would you like to pay?");
                                account.payFine(keyboard.nextDouble());
                                break;
                            case 6:
                                if (!account.getType().equals("Librarian")) {
                                    System.out.println("You don't have access to these commands");
                                    break;
                                }
                                System.out.println("Are you adding another copy of a item(1), or a new item?(2)"); //TODO add other types of items
                                switch (keyboard.nextInt()) {
                                    case 1:
                                        System.out.println("What is the name of the item");
                                        String addedItem = keyboard.nextLine();
                                        for (int i = 0; i < itemDB.size(); i++) {
                                            if (itemDB.get(i).getTitle().equals(addedItem)) {
                                                itemDB.get(i).setNumCopies(itemDB.get(i).getNumCopies() + 1);
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("What's the title?");
                                        String title2 = keyboard.nextLine();
                                        System.out.println("What's the id?");
                                        String id = keyboard.nextLine();
                                        System.out.println("What's the year it was written?");
                                        String year = keyboard.nextLine();
                                        System.out.println("What's the genre?");
                                        String genre = keyboard.nextLine();
                                        System.out.println("What's the isbn?");
                                        String isbn = keyboard.nextLine();
                                        System.out.println("Who's the publisher?");
                                        String publisher = keyboard.nextLine();
                                        System.out.println("Who's the author?");
                                        String author = keyboard.nextLine();
                                        System.out.println("How many copies are you adding");
                                        Long copies = keyboard.nextLong();
                                        System.out.println("Is it a new arrival? Enter true or false");
                                        Boolean arrival = keyboard.nextBoolean();
                                        System.out.println("What's the condition?");
                                        String condition = keyboard.nextLine();
                                        System.out.println("True or False: this book is for mature audiences");
                                        Boolean mature = keyboard.nextBoolean();
                                        System.out.println("How many days can this be checked out?");
                                        int days = keyboard.nextInt();
                                        break;
                                }
                                break;
                            case 7:
                                if (!account.getType().equals("Librarian")) {
                                    System.out.println("You don't have access to these commands");
                                    break;
                                }
                                System.out.println("Which item would you like to remove?");
                                String removedItem = keyboard.nextLine();
                                System.out.println("How many copies");
                                int numCopies = keyboard.nextInt();
                                for (int i = 0; i < itemDB.size(); i++) {
                                    if (itemDB.get(i).getTitle().equals(removedItem)) {
                                        itemDB.get(i).setNumCopies(itemDB.get(i).getNumCopies() - numCopies);
                                        if (itemDB.get(i).getNumCopies() <= 0) {
                                            itemDB.remove(itemDB.get(i));
                                        }
                                    }
                                }
                                break;
                            case 8:
                                if (!account.getType().equals("Librarian")) {
                                    System.out.println("You don't have access to these commands");
                                    break;
                                }
                                System.out.println("What would you like to tell the users?");
                                String message = keyboard.nextLine();
                                account.notifyObservers(userDB, message);
                                break;
                            case 3:
                                System.out.println("Would you like to see ratings (1) or leave a rating (2)?");
                                int viewRating = keyboard.nextInt();
                                switch(viewRating) {
                                    case 1:
                                        System.out.println("What book would you like to see a rating and review for?");
                                        String bookRate = keyboard.nextLine();
                                        keyboard.nextLine();
                                        for (int i = 0; i < itemDB.size(); i++) {
                                            if (itemDB.get(i).getTitle().equals(bookRate)) {
                                                itemDB.get(i).addRating(startRating);
                                                itemDB.get(i).getRatingList().toString();
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("What book would you like to leave a rating for?");
                                        String bookName = keyboard.nextLine();
                                        keyboard.nextLine();
                                        System.out.println("Enter a rating of 1-5 stars");
                                        double stars = keyboard.nextDouble();
                                        System.out.println("Enter your review below");
                                        String review = keyboard.nextLine();
                                        keyboard.nextLine();
                                        Rating newRating = new Rating(stars, review);
                                        for (int i = 0; i < itemDB.size(); i++) {
                                            if (itemDB.get(i).getTitle().equals(bookName)) {
                                                itemDB.get(i).addRating(newRating);
                                            }
                                        }
                                }
                                break;
                            case 4:
                                System.out.println("Logging out...");
                                quit2 = true;
                                break;
                        }
                    }
                    break;
                    case 3:
                        System.out.println("Bye");
                        quit = true;
                        break;

            }
        }
    }
}

