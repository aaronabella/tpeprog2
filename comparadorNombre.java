package tpeprog2;
import java.util.Comparator;
public class comparadorNombre implements Comparator<Object>{

    @Override
    public int compare(Object o, Object o2){
        return o.getNombre().compareTo(o2.getNombre());
    }
}
