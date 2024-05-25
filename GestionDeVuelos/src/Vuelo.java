public class Vuelo {
    private String numeroVuelo;
    private String destino;
    private boolean enCurso;

    public Vuelo(String numeroVuelo, String destino) {
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.enCurso = false;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public boolean isEnCurso() {
        return enCurso;
    }

    public void iniciarVuelo() {
        this.enCurso = true;
        System.out.println("Vuelo " + numeroVuelo + " hacia " + destino + " iniciado.");
    }

    public void finalizarVuelo() {
        this.enCurso = false;
        System.out.println("Vuelo " + numeroVuelo + " hacia " + destino + " finalizado.");
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", destino='" + destino + '\'' +
                ", enCurso=" + enCurso +
                '}';
    }
}

