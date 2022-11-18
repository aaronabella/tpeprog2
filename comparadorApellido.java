package tpeprog2;

import java.util.Comparator;
import tpeprog2.alumno;

public class comparadorApellido implements Comparator<Object> {

    @Override
    public int compare(Object o, Object o2) {
        alumno a = (alumno) ((nodo) o).getObject();
        alumno b = (alumno) o2;
        return a.getApellido().compareTo(b.getApellido());
    }

}