public class DVD extends Item {
    private String director;
    private String actor;

    /**
     * Parameterized Constructor
     * @param id
     * @param title
     * @param year
     * @param genre
     * @param numCopies
     * @param newArrival
     * @param isCheckedOut
     * @param director
     * @param actor
     */
    public DVD(int id, String title,int year, String genre, int numCopies, boolean newArrival,
               boolean isCheckedOut, String director, String actor) {
        super(id, title, year, genre, numCopies, newArrival, isCheckedOut);
        this.setDirector(director);
        this.setActor(actor);

    }

    /**
     * Getters and Setters
     * @return
     */
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
