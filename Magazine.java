public class Magazine extends Item{
    private String publisher;
    private int volume;
    private int issue;

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
    public Magazine(int id, String title,int year, String genre, int numCopies, boolean newArrival,
                    boolean isCheckedOut, String publisher, int volume, int issue) {
        super(id, title, year, genre, numCopies, newArrival, isCheckedOut);
        this.setPublisher(publisher);
        this.setVolume(volume);
        this.setIssue(issue);
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }
}
