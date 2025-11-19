package ua.opnu;

public class SearchUtils {

    public static <T extends Comparable<? super T>, V extends T> boolean contains(T[] array, V element) {

        for (T item : array) {
            if (item.compareTo(element) == 0)
                return true;
        }

        return false;
    }
}
