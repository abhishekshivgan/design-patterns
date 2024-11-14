package FacadePattern;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private static List<Movie> movies = new ArrayList<>(List.of(
        new Movie("Inception", "sci-fi", 350.00),
        new Movie("The Dark Knight", "Action", 300.00)
    ));


    public static void getMovies() {
        for (int i=0; i<movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println(i+1 + " Title " + m.getTitle() + " " + "Genre " + m.getGenre() + " " + "Price " + m.getPrice());
        }
    }

    public static Movie getMovie(int no) {
        if (no <= movies.size()) {
            return movies.get(no-1);
        }

        throw new RuntimeException("Invalid movie number");
    }
}
