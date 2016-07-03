package my.di;

public class MovieLister implements InjectFinder {

    private MovieFinder finder;
    
    @Override
    public void injectFinder(MovieFinder finder) {
        this.finder = finder;
    }

}
