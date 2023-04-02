package lesson3.task;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    private static final List<List<String>> LIBRARY = new ArrayList<>();

    public static List<List<String>> fillLibrary(List<String> genreAndBooks){
        LIBRARY.add(genreAndBooks);
        return LIBRARY;
    }

    public static List<List<String>> fillLibraryB(List<List<String>> genresAndBooks){
        LIBRARY.addAll(genresAndBooks);
        return LIBRARY;
    }
}
