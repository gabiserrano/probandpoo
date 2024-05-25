import java.util.HashMap;
import java.util.Map;

public class Cliente {
    private String nombre;
    private Map<String, Cuenta> cuentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cuentas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void abrirCuenta(String tipoCuenta) {
        if (!cuentas.containsKey(tipoCuenta)) {
            cuentas.put(tipoCuenta, new Cuenta(tipoCuenta));
            System.out.println("Cuenta de tipo " + tipoCuenta + " abierta para " + nombre);
        } else {
            System.out.println("El cliente ya tiene una cuenta de tipo " + tipoCuenta);
        }
    }

    public Cuenta getCuenta(String tipoCuenta) {
        return cuentas.get(tipoCuenta);
    }

    public void mostrarCuentas() {
        System.out.println("Cuentas de " + nombre + ":");
        for (Cuenta cuenta : cuentas.values()) {
            System.out.println(cuenta);
        }
    }
}
