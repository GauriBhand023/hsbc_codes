package com.example.movies; // Define the package for the SpecialMovie class

// Define the SpecialMovie class which extends the Movie class
public class SpecialMovie extends Movie {
    private String soundEffects; // Private field to store the sound effects of the movie
    private String visualEffects; // Private field to store the visual effects of the movie

    // Constructor for SpecialMovie which takes parameters for all attributes
    public SpecialMovie(String movieName, String producedBy, String directedBy, double duration, int year, String category, String soundEffects, String visualEffects) {
        // Call the constructor of the superclass (Movie) to initialize the inherited attributes
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffects = soundEffects; // Initialize the soundEffects field
        this.visualEffects = visualEffects; // Initialize the visualEffects field
    }

    // Override the showDetails method from the Movie class
    @Override
    public void showDetails() {
        super.showDetails(); // Call the showDetails method from the superclass (Movie)
        String additionalDetails = "Sound Effects: " + soundEffects + ", Visual Effects: " + visualEffects;
        // Create a string with additional details
        System.out.println(additionalDetails); // Print the additional details
    }

    // Getter method for the soundEffects field
    public String getSoundEffects() {
        return soundEffects; // Return the value of the soundEffects field
    }

    // Getter method for the visualEffects field
    public String getVisualEffects() {
        return visualEffects; // Return the value of the visualEffects field
    }
}
