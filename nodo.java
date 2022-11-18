public class nodo {
    private Object object;
    private nodo nodoSiguiente;
    private nodo nodoAnterior;

    public Object getObject(){
        return object;
    }
    public void setObject(Object object){
        this.object = object;
    }

    public nodo getSiguienteNodo(){
        return nodoSiguiente;
    }

    public void setSiguienteNdodo(nodo nodoSiguiente){
        this.nodoSiguiente = nodoSiguiente;
    }

    public void unirSiguiente(nodo nodo){
        nodoSiguiente = nodo;
    }
    
    public nodo(Object object){
        this.object = object;
        this.nodoSiguiente = null;
    }
        
}
