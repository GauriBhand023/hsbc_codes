package com.example.movies; // Define the package for the EnhancedMovie class

import com.example.media.EnhancedMedia; // Import the EnhancedMedia interface

// Define the EnhancedMovie class which extends the Movie class and implements the EnhancedMedia interface
public class EnhancedMovie extends Movie implements EnhancedMedia {
    // Constructor for EnhancedMovie which takes parameters for all attributes
    public EnhancedMovie(String movieName, String producedBy, String directedBy, double duration, int year, String category) {
        // Call the constructor of the superclass (Movie) to initialize the attributes
        super(movieName, producedBy, directedBy, duration, year, category);
    }

    // Override the play method from the EnhancedMedia interface
    @Override
    public void play() {
        System.out.println("Playing the movie."); // Print a message indicating the movie is playing
    }

    // Override the stop method from the EnhancedMedia interface
    @Override
    public void stop() {
        System.out.println("Stopping the movie."); // Print a message indicating the movie is stopping
    }

    // Override the pause method from the EnhancedMedia interface
    @Override
    public void pause() {
        System.out.println("Pausing the movie."); // Print a message indicating the movie is pausing
    }

    // Override the rewind method from the EnhancedMedia interface
    @Override
    public void rewind() {
        System.out.println("Rewinding the movie."); // Print a message indicating the movie is rewinding
    }
}
