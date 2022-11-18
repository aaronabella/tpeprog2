package tpe;

import java.util.ArrayList;

public class grupos extends elemento{
    private ArrayList<elemento> elementos;

    public grupos(String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(elemento elem){
        this.elementos.add(elem);
    }
    
    @Override
    public int getAlumnosTotal(){
        int total = 0;
        for(elementos elemento:elementos){
            total += elemento.getAlumnosTotal():
            return total;
        }
    }
}
