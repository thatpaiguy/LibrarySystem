public class Item {

    public int id;
    public String title;
    public int year;
    public String genre;
    public int numCopies;
    public boolean newArrival;
    public boolean isCheckedOut;


    public Item() {
        this.id = 0;
        this.title = "none";
        this.year = 0;
        this.genre = "none";
        this.numCopies = 0;
        this.newArrival = false;
        this.isCheckedOut = false;
    }

    public Item(int id, String title, int year, String genre, int numCopies, boolean newArrival, boolean isCheckedOut) {
        this.setId(id);
        this.setTitle(title);
        this.setYear(year);
        this.setGenre(genre);
        this.setNumCopies(numCopies);
        this.setNewArrival(newArrival);
        this.setCheckedOut(isCheckedOut);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
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
}
