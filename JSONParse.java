import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;

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
                String id = (String)magJSON.get("id");
                String title = (String)magJSON.get("title");
                String year = (String)magJSON.get("year");
                String genre = (String)magJSON.get("genre");
                String publisher = (String)magJSON.get("publisher");
                String volume = (String)magJSON.get("volume");
                String issue = (String)magJSON.get("issue");
                long numCopies = (long)magJSON.get("numCopies");
                boolean newArrival = (boolean)magJSON.get("newArrival");
                boolean isCheckedOut = (boolean)magJSON.get("isCheckedOut");
                String condition = (String)magJSON.get("condition");
                boolean mRating = (boolean) magJSON.get("matureRating");
                long dDate = (long)magJSON.get("dueDate");

                mags.add(new Magazine(id,title,year,genre,numCopies,newArrival,isCheckedOut,publisher,volume,issue, condition,mRating,dDate));
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
                    String id = (String)dvdJSON.get("id");
                    String title = (String)dvdJSON.get("title");
                    String year = (String)dvdJSON.get("year");
                    String genre = (String)dvdJSON.get("genre");
                    String director = (String)dvdJSON.get("director");
                    String actors = (String)dvdJSON.get("actors");
                    long numCopies = (long)dvdJSON.get("numCopies");
                    boolean newArrival = (boolean)dvdJSON.get("newArrival");
                    boolean isCheckedOut = (boolean)dvdJSON.get("isCheckedOut");
                    boolean mRating = (boolean)dvdJSON.get("matureRating");
                    long dDate = (long)dvdJSON.get("dueDate");

                    dvds.add(new DVD(id, title,year,genre,numCopies,newArrival,isCheckedOut, director,actors,mRating,dDate));
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
                    String id = (String)bookJSON.get("id");
                    String title = (String)bookJSON.get("title");
                    String year = (String)bookJSON.get("year");
                    String genre = (String)bookJSON.get("genre");
                    String ISBN = (String)bookJSON.get("ISBN");
                    String publisher = (String)bookJSON.get("publisher");
                    String author = (String)bookJSON.get("author");
                    long numCopies = (long)bookJSON.get("numCopies");
                    boolean newArrival = (boolean)bookJSON.get("newArrival");
                    boolean isCheckedOut = (boolean)bookJSON.get("isCheckedOut");
                    String condition = (String)bookJSON.get("condition");
                    boolean mRating = (boolean)bookJSON.get("matureRating");
                    long dDate = (long)bookJSON.get("dueDate");

                    books.add(new Book(id, title, year, genre, numCopies, newArrival, isCheckedOut, ISBN, publisher,
                        author,condition,mRating,dDate));
                }
                return books;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}