package my.di;

public class DI {
    
    private static Container container;

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.configureContainer();
//        MovieLister lister = (MovieLister)container.lookup("MovieLister");
//        String[] movies = lister.getAllMarvelMovies();
    }

}
