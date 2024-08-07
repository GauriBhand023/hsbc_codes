package day9;
import java.util.List;

class MovieUtils {
    public static void getMovies(List<Movie> movies, MovieFinder movieFinder) {
        for (Movie movie : movies) {
            if (movieFinder.findMovie(movie)) {
                System.out.println(movie);
            }
        }
    }
}
