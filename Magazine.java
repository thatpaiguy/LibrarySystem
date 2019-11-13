public class Magazine extends Item{
    private String publisher;
    private String volume;
    private String issue;
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
    public Magazine(String id, String title,String year, String genre, long numCopies, boolean newArrival, boolean isCheckedOut,
                    String publisher, String volume, String issue, String condition, boolean matureRating,long dueDate) {
        super(id, title, year, genre, numCopies, newArrival, isCheckedOut,matureRating,dueDate);
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

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
