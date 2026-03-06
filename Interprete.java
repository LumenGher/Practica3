public class Interprete {

    private String nombre;
    private int anios;

    public Interprete(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Interprete: " + nombre;
    }
}
