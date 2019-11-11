public class Item {

    protected long id;
    protected String title;
    protected long year;
    protected String genre;
    protected long numCopies;
    protected boolean newArrival;
    protected boolean isCheckedOut;
    protected String[] waitlist;


    /**
     * Default constructor
     */
    public Item() {
        this.id = 0;
        this.title = "none";
        this.year = 0;
        this.genre = "none";
        this.numCopies = 0;
        this.newArrival = false;
        this.isCheckedOut = false;
        //this.waitlist[0] = "none";
    }

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
    public Item(long id, String title, long year, String genre, long numCopies, boolean newArrival, boolean isCheckedOut) {
        this.setId(id);
        this.setTitle(title);
        this.setYear(year);
        this.setGenre(genre);
        this.setNumCopies(numCopies);
        this.setNewArrival(newArrival);
        this.setCheckedOut(isCheckedOut);
        //this.setWaitlist(waitlist);
    }

    /**
     * Getters and Setters
     * @return
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
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

    /*
    public String[] getWaitlist() {
        return waitlist;
    }

    public void setWaitlist(String[] waitlist) {
        this.waitlist = waitlist;
    }
     */
}
