package my.di;

import java.util.Arrays;
import java.util.List;

public class CSVMovieFinder implements MovieFinder, InjectFinderFilename, Injector {

    private String fileName;
    @Override
    public void injectFilename(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<String> findAll() {
        return Arrays.asList("Movie 1", "Movie 2", "Movie 3");
    }

    @Override
    public void inject(Object target) {
        ((InjectFinder)target).injectFinder(this);
    }

}
