package tpe;
public class lista {
    private nodo primero;

    public lista(){
        primero = null;
    }


    public boolean isEmpty(){
        if (primero == null){
          return true;  
        }
        else{return false;}
    }
}
