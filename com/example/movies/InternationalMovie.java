package com.example.movies; // Define the package for the InternationalMovie class

// Define the InternationalMovie class which extends the Movie class
public class InternationalMovie extends Movie {
    private String country; // Private field to store the country of the movie
    private String language; // Private field to store the language of the movie

    // Constructor for InternationalMovie which takes parameters for all attributes
    public InternationalMovie(String movieName, String producedBy, String directedBy, double duration, int year, String category, String country, String language) {
        // Call the constructor of the superclass (Movie) to initialize the inherited attributes
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country; // Initialize the country field
        this.language = language; // Initialize the language field
    }

    // Override the showDetails method from the Movie class
    @Override
    public void showDetails() {
        super.showDetails(); // Call the showDetails method from the superclass (Movie)
        String additionalDetails = "Country: " + country + ", Language: " + language; // Create a string with additional details
        System.out.println(additionalDetails); // Print the additional details
    }

    // Getter method for the country field
    public String getCountry() {
        return country; // Return the value of the country field
    }

    // Getter method for the language field
    public String getLanguage() {
        return language; // Return the value of the language field
    }
}
