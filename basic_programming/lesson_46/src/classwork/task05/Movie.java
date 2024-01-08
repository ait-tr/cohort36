package classwork.task05;

import java.util.Objects;

public class Movie {
    private String name;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String name, String genre, int duration, double rating) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", "
                + "Genre: " + genre + ", "
                + "Duration: " + duration + "m, "
                + "Rating: " + rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, duration, rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Movie) {
            Movie movie = (Movie) o;

            return this.name.equals(movie.name)
                    && this.genre.equals(movie.genre)
                    && this.duration == movie.duration
                    && this.rating == movie.rating;
        }
        return false;
    }
}
