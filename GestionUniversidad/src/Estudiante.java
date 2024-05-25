public class Estudiante {
    private String nombre;
    private String carrera;
    private int semestreActual;

    public Estudiante(String nombre, String carrera, int semestreActual) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }
}
