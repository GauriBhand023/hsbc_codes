package com.example.movies; // Define the package for the Movie class

public class Movie {
    private String movieName; // Private field to store the name of the movie
    private String producedBy; // Private field to store the producer of the movie
    private String directedBy; // Private field to store the director of the movie
    private double duration; // Private field to store the duration of the movie in minutes
    private int year; // Private field to store the release year of the movie
    private String category; // Private field to store the category of the movie
    private static int moviesCount = 0; // Static variable to keep track of the total number of movies created
    private String movieId; // Private field to store the unique ID of the movie

    // Constructor with mandatory fields
    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("Movie name and produced by are mandatory fields");
            // Throw an exception if movieName or producedBy is null
        }
        this.movieName = movieName; // Initialize the movieName field
        this.producedBy = producedBy; // Initialize the producedBy field
        moviesCount++; // Increment the moviesCount static variable
        this.movieId = generateMovieId(); // Generate and assign a unique movieId
    }

    // Constructor with all fields
    public Movie(String movieName, String producedBy, String directedBy, double duration, int year, String category) {
        this(movieName, producedBy); // Call the constructor with mandatory fields
        this.directedBy = directedBy; // Initialize the directedBy field
        this.duration = duration; // Initialize the duration field
        this.year = year; // Initialize the year field
        this.category = category; // Initialize the category field
    }

    // Private method to generate a unique movieId
    private String generateMovieId() {
        return movieName + "_" + moviesCount; // Concatenate movieName and moviesCount to create a unique ID
    }

    // Getter method for the movieId field
    public String getMovieId() {
        return movieId; // Return the value of the movieId field
    }

    // Static method to get the total number of movies created
    public static int getMoviesCount() {
        return moviesCount; // Return the value of the moviesCount static variable
    }

    // Method to display the details of the movie
    public void showDetails() {
        String details = "Movie Name: " + movieName + ", Produced By: " + producedBy +
                ", Directed By: " + directedBy + ", Duration: " + duration + " mins" +
                ", Year: " + year + ", Category: " + category + ", Movie ID: " + movieId;
        // Concatenate all the field values into a single string
        System.out.println(details); // Print the details string
    }
}
