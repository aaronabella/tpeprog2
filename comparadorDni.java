package tpeprog2;

import java.util.Comparator;

public class comparadorDni implements Comparator<Object> {

    @Override
    public int compare(Object o, Object o2) {
        alumno a = (alumno) ((nodo) o).getObject();
        alumno b = (alumno) o2;
        return a.getDni() - (b.getDni());
    }
}
