package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MoviesDemo {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Sholay", "Amitabh Bachchan", 1975, 8.2));
        movies.add(new Movie(2, "Dilwale Dulhania Le Jayenge", "Shah Rukh Khan", 1995, 8.0));
        movies.add(new Movie(3, "3 Idiots", "Aamir Khan", 2009, 8.4));
        movies.add(new Movie(4, "Lagaan", "Aamir Khan", 2001, 8.1));
        movies.add(new Movie(5, "Dangal", "Amir khan", 2016, 8.4));
        movies.add(new Movie(6, "Bajrangi Bhaijaan", "Salman Khan", 2015, 8.0));
        movies.add(new Movie(7, "PK", "Aamir Khan", 2014, 8.1));
        movies.add(new Movie(8, "Swades", " Shah Rukh Khan", 2004, 8.2));
        movies.add(new Movie(9, "Gully Boy", "Ranveer Singh", 2019, 8.0));
        movies.add(new Movie(10, "Aarzu", "Shahid Kapoor", 2019, 3.5));

        // 1. Print all the movies whose name starts with "a"
        System.out.println("Movies whose name starts with 'A':");
        MovieUtils.getMovies(movies, movie -> movie.getName().toLowerCase().startsWith("a"));

        // 2. Print all movies whose rating is greater than or equal to 3.5
        System.out.println("\nMovies with rating >= 3.5:");
        MovieUtils.getMovies(movies, movie -> movie.getRating() >= 3.5);

        // 3. Print all movies with a specific hero name
        System.out.println("\nMovies with hero 'Aamir Khan':");
        MovieUtils.getMovies(movies, movie -> "Aamir Khan".equals(movie.getHero()));

        // 4. Print all movies released in a specific year
        System.out.println("\nMovies released in 2015:");
        MovieUtils.getMovies(movies, movie -> movie.getYearOfRelease() == 2015);

        // Print all movies details using forEach() of List (Use Consumer interface for this)
        System.out.println("\nAll movies:");
        Consumer<Movie> printMovie = movie -> System.out.println(movie);
        movies.forEach(printMovie);
    }
}
