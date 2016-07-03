package my.di;

public class Tester {
    private Container container;
    
    public void configureContainer() {
        container = new Container();
        registerComponents();
        registerInjectors();
        container.start();
    }

    private void registerComponents() {
        container.registerComponent("MovieLister", MovieLister.class);
        container.registerComponent("MovieFinder", CSVMovieFinder.class);
    }
    
    private void registerInjectors() {
        container.registerInjector(InjectFinderFilename.class, new FinderFilenameInjector());
    }
    
    public static class FinderFilenameInjector implements Injector {
        @Override
        public void inject(Object target) {
            ((InjectFinderFilename)target).injectFilename("movies.csv");
            
        }
    }
}
