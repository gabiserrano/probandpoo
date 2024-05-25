import java.time.LocalDate;

public class RegistroTransfusion {
    private String paciente;
    private String tipoSangre;
    private LocalDate fecha;
    private String hospital;

    public RegistroTransfusion(String paciente, String tipoSangre, LocalDate fecha, String hospital) {
        this.paciente = paciente;
        this.tipoSangre = tipoSangre;
        this.fecha = fecha;
        this.hospital = hospital;
    }

    // Getters y Setters
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
