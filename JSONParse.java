import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONParse {
    private static final String BOOK_FILE = "books.json";

    public static ArrayList<Book> loadBooks() {
        ArrayList<Book> books = new ArrayList<Book>();

        try {
                FileReader reader = new FileReader("src/books.json");
                JSONParser parser = new JSONParser();
                JSONObject jsonData = (JSONObject)new JSONParser().parse(reader);
                JSONArray booksJSON = (JSONArray)jsonData.get("books");

                for(int i = 0; i < booksJSON.size(); i++) {
                    JSONObject bookJSON = (JSONObject)booksJSON.get(i);
                    int id = (int)bookJSON.get("id");
                    String title = (String)bookJSON.get("title");
                    int year = (int)bookJSON.get("year");
                    String genre = (String)bookJSON.get("genre");
                    String ISBN = (String)bookJSON.get("ISBN");
                    String publisher = (String)bookJSON.get("publisher");
                    String author = (String)bookJSON.get("author");
                    int numCopies = (int)bookJSON.get("numCopies");
                    boolean newArrival = (boolean)bookJSON.get("newArrival");


                    books.add(new Book(id, title, year, genre, ISBN, publisher,
                        author, numCopies, newArrival));

                }

                return books;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }




}
