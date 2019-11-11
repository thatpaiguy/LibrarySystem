import java.util.ArrayList;

public class ItemConnect {

    private static ItemConnect item = null;
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<DVD> dvdList = new ArrayList<>();
    private ArrayList<Magazine> magList;



    private ItemConnect() {
        bookList = JSONParse.loadBooks();
        dvdList = JSONParse.loadDvd();
        magList = JSONParse.loadMag();

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

    public ArrayList<DVD> getDvdList() {
        return dvdList;
    }

    public ArrayList<Magazine> getMagList() {
        return magList;
    }

}