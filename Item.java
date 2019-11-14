import java.util.LinkedList;
import java.util.Queue;

public class Item {

    protected String id;
    protected String title;
    protected String year;
    protected String genre;
    protected long numCopies;
    protected boolean newArrival;
    protected boolean isCheckedOut;
    protected boolean matureRating;
    protected long dueDate;
    protected Queue waitlist = new LinkedList<User>();
    protected LinkedList<Rating> ratingList;

    /**
     * parameterized constructor
     * @param id
     * @param title
     * @param year
     * @param genre
     * @param numCopies
     * @param newArrival
     * @param isCheckedOut
     */
    public Item(String id, String title, String year, String genre, long numCopies, boolean newArrival,
                boolean isCheckedOut, boolean matureRating, long dueDate) {
        this.setId(id);
        this.setTitle(title);
        this.setYear(year);
        this.setGenre(genre);
        this.setNumCopies(numCopies);
        this.setNewArrival(newArrival);
        this.setCheckedOut(isCheckedOut);
        this.setMatureRating(matureRating);
        waitlist = new LinkedList<User>();
        this.setDueDate(dueDate);
        ratingList = new LinkedList<Rating>();
    }

    /**
     * Getters and Setters
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(long numCopies) {
        this.numCopies = numCopies;
    }

    public boolean isNewArrival() {
        return newArrival;
    }

    public void setNewArrival(boolean newArrival) {
        this.newArrival = newArrival;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public boolean isMatureRating() {
        return matureRating;
    }

    public void setMatureRating(boolean matureRating) {
        this.matureRating = matureRating;
    }

    public long getDueDate() {
        return dueDate;
    }

    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }

    public void addUser(User user) {
        if(waitlist.contains(user)) {
            System.out.println("User already on wait list.");
            return;
        }
        waitlist.add(user.getUsername());

    }

    public void removeUser(User user) {
        if(waitlist.contains(user)) {
            waitlist.remove(user);
        }
        else {
            System.out.println("This user is not on the wait list.");
        }
    }
    public void addRating(Rating rating)
    {
        ratingList.add(rating);
    }
    public LinkedList<Rating> getRatingList(){
        return ratingList;
    }
}
