package FacadePattern;

public class Movie {
    private String title;
    private String genre;
    private double price;

    public Movie(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    
}
