package tpeprog2;

import java.util.ArrayList;

public class alumno extends elemento {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private ArrayList<String> intereses;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<String> getIntereses() {
        return new ArrayList<>(intereses);
    }

    public void addNuevoInteres(String nuevo) {
        if ((nuevo != null) && (!intereses.contains(nuevo))) {
            intereses.add(nuevo);
        }
    }

    public alumno(String nombre, String apellido, int edad, int dni) {
        super(nombre);
        this.apellido = apellido;
        this.dni = dni;

    }

    @Override
    public int getAlumnosTotal() {
        return 1;
    }
}
