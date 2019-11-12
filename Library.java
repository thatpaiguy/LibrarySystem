import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Library {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Library System!\n" +
                "Would you like to Create an account(1) " +
                "or Login(2)? Type a '1' or a '2'");
        int answer = input.nextInt();

        switch (answer) {       //Switch for login or create account
            case 1:
                //Create Account
                break;
            case 2:
                //Login
                break;
        }



        /**
         * Creates an instance that reads all data to the book ArrayList
         */
        ItemConnect itemConnect = ItemConnect.getInstance();
        ArrayList<Book> BookLists = itemConnect.getBookList();
        for(Book books : BookLists) {
            System.out.println("ID: "+books.getId()+ "\n Title: "+ books.getTitle()+"\n Year: "+ books.getYear()+"\n Genre: "+ books.getGenre()+
                    "\n Number of Copies: "+ books.getNumCopies()+ "\n New Arrival: "+books.isNewArrival()+"\n Book is checked out: " +books.isCheckedOut()+
                    "\n ISBN: "+ books.getISBN()+ "\n Publisher: "+ books.getPublisher() + "\n Author: " +books.getAuthor() + "\n Condition: "+
                    books.getCondition());
        }

        /**
         * Creates an instance that reads all data to the Magazine Arraylist
         */
        ArrayList<Magazine> MagLists = itemConnect.getMagList();
        for(Magazine mags : MagLists) {
            System.out.println("ID: "+mags.getId()+"\n Title: "+mags.getTitle()+"\n Year: "+mags.getYear()+"\n Genre: "+mags.getGenre()+
                    "\n Number of Copies: "+ mags.getNumCopies()+ "\n New Arrival: "+mags.isNewArrival()+"\n Book is checked out: "+mags.isCheckedOut()+
                    "\n Publisher: "+mags.getPublisher()+"\n Volume: "+mags.getVolume()+"\n Issue: "+mags.getIssue()+"\n Condition: "+mags.getCondition());

        }

        /**
         * Creates an instance that reads all data to the DVD Arraylist
         */

        ArrayList<DVD> DVDLists = itemConnect.getDvdList();
        for(DVD dvds : DVDLists) {
            System.out.println("ID: "+dvds.getId()+ "\n Title: "+ dvds.getTitle()+"\n Year: "+dvds.getYear()+"\n Genre: "+dvds.getGenre()+
                    "\n Number of Copies: "+ dvds.getNumCopies()+ "\n New Arrival: "+dvds.isNewArrival()+"\n DVD is checked out: "+dvds.isCheckedOut()+
            "\n Director: "+dvds.getDirector()+"\n Actor(s): "+ dvds.getActors());
        }


    }
}
