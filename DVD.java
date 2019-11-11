public class DVD extends Item {
    private String director;
    private String actors;

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
     * @param actors
     */
    public DVD(long id, String title, long year, String genre, long numCopies, boolean newArrival,
               boolean isCheckedOut, String director, String actors) {
        super(id, title, year, genre, numCopies, newArrival, isCheckedOut);
        this.setDirector(director);
        this.setActor(actors);

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

    public String getActors() {
        return actors;
    }

    public void setActor(String actor) {
        this.actors = actor;
    }
}
