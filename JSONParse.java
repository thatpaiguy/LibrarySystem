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
    /**
     * Parsing the Magazine file
     * @return
     */

    public static ArrayList<Magazine> loadMag() {
        ArrayList<Magazine> mags = new ArrayList<Magazine>();

        try{
            FileReader magReader = new FileReader("src/magazines.json");
            JSONParser parser = new JSONParser();
            JSONObject magData = (JSONObject)new JSONParser().parse(magReader);
            JSONArray magsJSON = (JSONArray)magData.get("magazines ");


            for(int i = 0; i < magsJSON.size(); i++) {
                JSONObject magJSON = (JSONObject)magsJSON.get(i);
                long id = (long)magJSON.get("id");
                String title = (String)magJSON.get("title");
                long year = (long)magJSON.get("year");
                String genre = (String)magJSON.get("genre");
                String publisher = (String)magJSON.get("publisher");
                long volume = (long)magJSON.get("volume");
                long issue = (long)magJSON.get("issue");
                long numCopies = (long)magJSON.get("numCopies");
                boolean newArrival = (boolean)magJSON.get("newArrival");
                boolean isCheckedOut = (boolean)magJSON.get("isCheckedOut");
                String condition = (String)magJSON.get("condition");

                mags.add(new Magazine(id,title,year,genre,numCopies,newArrival,isCheckedOut,publisher,volume,issue, condition));
            }
            return mags;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Parsing the DVD file
     * @return
     */

    public static ArrayList<DVD> loadDvd() {
        ArrayList<DVD> dvds = new ArrayList<DVD>();

        try {
                FileReader dvdReader = new FileReader("src/dvds.json");
                JSONParser parser = new JSONParser();
                JSONObject dvdData = (JSONObject) new JSONParser().parse(dvdReader);
                JSONArray dvdsJSON = (JSONArray)dvdData.get("dvds");

                for(int i = 0; i < dvdsJSON.size(); i++) {
                    JSONObject dvdJSON = (JSONObject)dvdsJSON.get(i);
                    long id = (long)dvdJSON.get("id");
                    String title = (String)dvdJSON.get("title");
                    long year = (long)dvdJSON.get("year");
                    String genre = (String)dvdJSON.get("genre");
                    String director = (String)dvdJSON.get("director");
                    String actors = (String)dvdJSON.get("actors");
                    long numCopies = (long)dvdJSON.get("numCopies");
                    boolean newArrival = (boolean)dvdJSON.get("newArrival");
                    boolean isCheckedOut = (boolean)dvdJSON.get("isCheckedOut");



                    dvds.add(new DVD(id, title,year,genre,numCopies,newArrival,isCheckedOut, director,actors));
                }
                return dvds;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Parsing the Book file
     * @return
     */

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
                    String condition = (String)bookJSON.get("condition");



                    books.add(new Book(id, title, year, genre, numCopies, newArrival, isCheckedOut, ISBN, publisher,
                        author,condition));
                }
                return books;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}