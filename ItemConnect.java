import java.util.ArrayList;

public class ItemConnect {

    private static ItemConnect item = null;
    private ArrayList<Book> bookList = new ArrayList<Book>();

    private ItemConnect() {
        bookList = JSONParse.loadBooks();
    }

    public static ItemConnect getInstance() {
        if(item == null) {
            item = new ItemConnect();
        }
        return item;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

}