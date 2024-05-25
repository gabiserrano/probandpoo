public class Pasajero {
    private String nombre;
    private String numeroPasaporte;
    private Vuelo vuelo;

    public Pasajero(String nombre, String numeroPasaporte) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void asignarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        System.out.println("Pasajero " + nombre + " asignado al vuelo " + vuelo.getNumeroVuelo());
    }
}
