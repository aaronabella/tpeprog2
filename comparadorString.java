package tpeprog2;

import java.util.Comparator;

public class comparadorString<T> implements Comparator<T> {
    public int compare(T o, T o2) {
        String p = (String) o;
        String p2 = (String) o2;

        return p.compareTo(p2);
    }
}
