public class Rating {
    private double stars;
    private String rating;
    public Rating(double aStars, String aRating){
        if(aStars >= 0 && aStars <=5)
            this.stars = aStars;
        this.rating = aRating;
    }

}
