package tpeprog2;

import java.util.Comparator;

public class comparadorInteger implements Comparator<Object> {

    public int compare(Object o, Object o2) {
        Integer i = (Integer) ((nodo) o).getObject();
        Integer j = (Integer) ((nodo) o2).getObject();

        return i.compareTo(j);
    }

}
