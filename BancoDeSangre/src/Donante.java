public class Donante {
    private String nombre;
    private int edad;
    private boolean saludable;
    private boolean elegible;

    public Donante(String nombre, int edad, boolean saludable, boolean elegible) {
        this.nombre = nombre;
        this.edad = edad;
        this.saludable = saludable;
        this.elegible = elegible;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    public boolean isElegible() {
        return elegible;
    }

    public void setElegible(boolean elegible) {
        this.elegible = elegible;
    }
}
