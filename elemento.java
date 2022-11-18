package tpeprog2;

public abstract class elemento {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getAlumnosTotal();
}
