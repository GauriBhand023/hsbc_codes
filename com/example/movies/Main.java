package com.example.movies; // Define the package for the Main class

import com.example.media.EnhancedMedia; // Import the EnhancedMedia interface

public class Main {
    public static void main(String[] args) {
        // Create movie objects
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "Christopher Nolan", 148, 2010, "Sci-Fi");
        // Create an instance of Movie with name, producer, director, duration, year, and category

        SpecialMovie movie2 = new SpecialMovie("Avatar", "James Cameron", "James Cameron", 162, 2009, "Action", "Dolby Atmos", "3D CGI");
        // Create an instance of SpecialMovie with additional sound and visual effects attributes

        InternationalMovie movie3 = new InternationalMovie("Parasite", "Kwak Sin-ae", "Bong Joon-ho", 132, 2019, "Thriller", "South Korea", "Korean");
        // Create an instance of InternationalMovie with additional country and language attributes

        EnhancedMovie movie4 = new EnhancedMovie("Matrix", "Joel Silver", "Wachowskis", 136, 1999, "Sci-Fi");
        // Create an instance of EnhancedMovie which also implements EnhancedMedia

        // Create an array of Movie
        Movie[] movies = { movie1, movie2, movie3, movie4 };
        // Store the created movie objects in an array of type Movie

        // Traverse the array and call showDetails
        for (Movie movie : movies) {
            movie.showDetails(); // Call the showDetails method on each movie object

            if (movie instanceof SpecialMovie) { // Check if the movie is an instance of SpecialMovie
                SpecialMovie specialMovie = (SpecialMovie) movie; // Typecast to SpecialMovie
                System.out.println("Sound Effects: " + specialMovie.getSoundEffects()); // Print the sound effects
                System.out.println("Visual Effects: " + specialMovie.getVisualEffects()); // Print the visual effects
            } else if (movie instanceof InternationalMovie) { // Check if the movie is an instance of InternationalMovie
                InternationalMovie internationalMovie = (InternationalMovie) movie; // Typecast to InternationalMovie
                System.out.println("Country: " + internationalMovie.getCountry()); // Print the country
                System.out.println("Language: " + internationalMovie.getLanguage()); // Print the language
            }
        }

        // Display movie count
        System.out.println("Total movies created: " + Movie.getMoviesCount()); // Print the total number of movies created

        // Interface demonstration
        EnhancedMedia media = new EnhancedMovie("Matrix", "Joel Silver", "Wachowskis", 136, 1999, "Sci-Fi");
        // Create an instance of EnhancedMovie and assign it to a reference of type EnhancedMedia

        media.play(); // Call the play method using the EnhancedMedia reference
        media.pause(); // Call the pause method using the EnhancedMedia reference
        media.rewind(); // Call the rewind method using the EnhancedMedia reference
        media.stop(); // Call the stop method using the EnhancedMedia reference
    }
}
