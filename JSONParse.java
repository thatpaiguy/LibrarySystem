import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONParse {
    private static final String BOOK_FILE = "books.json";


    public static ArrayList<Magazine> loadMag() {
        ArrayList<Magazine> mags = new ArrayList<Magazine>();

        try{
            FileReader magReader = new FileReader("src/magazines.json");
            JSONObject magData = (JSONObject) new JSONParser().parse(magReader);
            JSONArray magsJSON = (JSONArray)magData.get("magazines");

            for(int i = 0; i < magsJSON.size(); i++) {
                JSONObject magJSON = (JSONObject)magsJSON.get(i);
                int id = (int)magJSON.get("id");
                String title = (String)magJSON.get("title");
                int year = (int)magJSON.get("year");
                String genre = (String)magJSON.get("genre");
                String publisher = (String)magJSON.get("publisher");
                int volume = (int)magJSON.get("volume");
                int issue = (int)magJSON.get("issue");
                int numCopies = (int)magJSON.get("numCopies");
                boolean newArrival = (boolean)magJSON.get("newArrival");
                boolean isCheckedOut = (boolean)magJSON.get("isCheckedOut");

                mags.add(new Magazine(id,title,year,genre,numCopies,newArrival,isCheckedOut,publisher,volume,issue));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<DVD> loadDvd() {
        ArrayList<DVD> dvds = new ArrayList<DVD>();

        try {
            FileReader dvdReader = new FileReader("src/dvds/json");
            JSONObject dvdData = (JSONObject) new JSONParser().parse(dvdReader);
            JSONArray dvdsJSON = (JSONArray)dvdData.get("dvds");

            for(int i = 0; i < dvdsJSON.size(); i++) {
                JSONObject dvdJSON = (JSONObject)dvdsJSON.get(i);
                int id = (int)dvdJSON.get("id");
                String title = (String)dvdJSON.get("title");
                int year = (int)dvdJSON.get("year");
                String genre = (String)dvdJSON.get("genre");
                String director = (String)dvdJSON.get("director");
                String actor = (String)dvdJSON.get("actors");
                int numCopies = (int)dvdJSON.get("numCopies");
                boolean newArrival = (boolean)dvdJSON.get("newArrival");
                boolean isCheckedOut = (boolean)dvdJSON.get("isCheckedOut");

                dvds.add(new DVD(id, title,year,genre,numCopies,newArrival,isCheckedOut, director,actor));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static ArrayList<Book> loadBooks() {
        ArrayList<Book> books = new ArrayList<Book>();

        try {
                FileReader bookReader = new FileReader("src/books.json");
                JSONParser parser = new JSONParser();
                JSONObject bookData = (JSONObject)new JSONParser().parse(bookReader);
                JSONArray booksJSON = (JSONArray)bookData.get("books");

                for(int i = 0; i < booksJSON.size(); i++) {
                    JSONObject bookJSON = (JSONObject)booksJSON.get(i);
                    long id = (long)bookJSON.get("id");
                    String title = (String)bookJSON.get("title");
                    long year = (long)bookJSON.get("year");
                    String genre = (String)bookJSON.get("genre");
                    String ISBN = (String)bookJSON.get("ISBN");
                    String publisher = (String)bookJSON.get("publisher");
                    String author = (String)bookJSON.get("author");
                    long numCopies = (long)bookJSON.get("numCopies");
                    boolean newArrival = (boolean)bookJSON.get("newArrival");
                    boolean isCheckedOut = (boolean)bookJSON.get("isCheckedOut");


                    books.add(new Book(id, title, year, genre, numCopies, newArrival, isCheckedOut, ISBN, publisher,
                        author));
                }
                return books;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }




}
