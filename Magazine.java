public class Magazine extends Item{
    private String publisher;
    private long volume;
    private long issue;
    private String condition;

    /**
     * Parameterized Constructor
     * @param id
     * @param title
     * @param year
     * @param genre
     * @param numCopies
     * @param newArrival
     * @param isCheckedOut
     * @param publisher
     * @param volume
     * @param issue
     */
    public Magazine(long id, String title,long year, String genre, long numCopies, boolean newArrival,
                    boolean isCheckedOut, String publisher, long volume, long issue, String condition) {
        super(id, title, year, genre, numCopies, newArrival, isCheckedOut);
        this.setPublisher(publisher);
        this.setVolume(volume);
        this.setIssue(issue);
        this.setCondition(condition);

    }

    /**
     * Getters and setters
     * @return
     */
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getIssue() {
        return issue;
    }

    public void setIssue(long issue) {
        this.issue = issue;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
