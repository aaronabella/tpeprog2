package tpe;

import tpe.alumno;

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
    public void agregarAlumno(alumno nuevoAlumno){
        if((nuevoAlumno !=null)&& (!lista.contains(nuevoAlumno))){
            insertar(nuevoAlumno);
        }
    }
    
    private void insertarOrdenado(alumno nuevAlumno){
        int i = 0;
        while((i< alumnos.size())&& (alumnos.get(i).compareTo(nuevAlumno) < 0)){
            i++;
        }
    }   alumnos.add(i, nuevoAlumno);
}
