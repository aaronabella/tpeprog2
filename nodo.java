public class nodo {
    private Object info;
    private nodo nodoSiguiente;

    public Object getObject() {
        return info;
    }

    public void setObject(Object info) {
        this.info = info;
    }

    public nodo getSiguienteNodo() {
        return nodoSiguiente;
    }

    public void setSiguienteNodo(nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public void unirSiguiente(nodo nodo) {
        nodoSiguiente = nodo;
    }

    public nodo(Object info, nodo n) {
        setObject(info);
        setSiguienteNodo(n);
    }

}
