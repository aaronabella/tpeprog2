package tpeprog2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Function;

public class lista implements Iterable<Object> {
    private nodo primero;
    private Comparator comp;
    private int tamanio;

    public lista(nodo primero, Comparator<Object> comp, int tamanio) {
        this.primero = null;
        this.comp = comp;
        this.tamanio = tamanio;
    }

    public void setComparador(Comparator<Object> comp) {
        this.comp = comp;
    }

    public boolean isEmpty() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarAlumno(alumno nuevoAlumno) {
        if ((nuevoAlumno != null) && (!lista.contains(nuevoAlumno))) {
            insert(nuevoAlumno);
        }
    }

    public void insert(Object o) {
        nodo temp = new nodo(o, null);
        temp.setSiguienteNodo(primero);
        primero = temp;
    }

    public void borrarPrimero(){
        if(this.isEmpty()){
            return;
        }
        else{
            primero = primero.getSiguienteNodo()
        }
    }

    public void borrarNodo(int posicion){
        if(this.isEmpty())
    }

    @Override
    public Iterator<Object> iterator() {
        return new iterarNodos();
    }

    
}
