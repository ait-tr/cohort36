package classwork.task05;

public class Main {
    /*
    Разработать класс фильм
    Применить инкапсуляцию, описать методы toString, hashCode и equals
     */
    public static void main(String[] args) {
        Movie movie = new Movie("Home alone", "Comedy/Family", 103, 7.7);
        System.out.println(movie);
        Movie movie1 = new Movie("Home alone", "Comedy/Family", 103, 7.7);
        System.out.println(movie1);
        System.out.println("Эти два фильма идентичны: " + movie.equals(movie1));
        Movie movie2 = new Movie("Home alone 2", "Comedy/Family", 120, 6.9);
        System.out.println(movie2);
        System.out.println("Этот фильм такой же как предыдущий: " + movie.equals(movie2));
    }
}
