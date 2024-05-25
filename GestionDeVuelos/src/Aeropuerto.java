public class Aeropuerto {
    private TerminalPasajeros terminalPasajeros;
    private GestionEquipajes gestionEquipajes;
    private OperacionesCarga operacionesCarga;
    private ServiciosAuxiliares serviciosAuxiliares;

    public Aeropuerto() {
        terminalPasajeros = new TerminalPasajeros();
        gestionEquipajes = new GestionEquipajes();
        operacionesCarga = new OperacionesCarga();
        serviciosAuxiliares = new ServiciosAuxiliares();
    }

    public TerminalPasajeros getTerminalPasajeros() {
        return terminalPasajeros;
    }

    public GestionEquipajes getGestionEquipajes() {
        return gestionEquipajes;
    }

    public OperacionesCarga getOperacionesCarga() {
        return operacionesCarga;
    }

    public ServiciosAuxiliares getServiciosAuxiliares() {
        return serviciosAuxiliares;
    }
}
