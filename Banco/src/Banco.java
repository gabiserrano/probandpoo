import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cliente> clientes;

    public Banco() {
        clientes = new HashMap<>();
    }

    public void agregarCliente(String nombre) {
        if (!clientes.containsKey(nombre)) {
            clientes.put(nombre, new Cliente(nombre));
            System.out.println("Cliente " + nombre + " agregado al banco.");
        } else {
            System.out.println("El cliente " + nombre + " ya existe.");
        }
    }

    public Cliente getCliente(String nombre) {
        return clientes.get(nombre);
    }

    public void mostrarClientes() {
        System.out.println("Clientes del banco:");
        for (Cliente cliente : clientes.values()) {
            System.out.println(cliente.getNombre());
        }
    }

    public void transferir(String nombreClienteOrigen, String tipoCuentaOrigen, String nombreClienteDestino, String tipoCuentaDestino, double cantidad) {
        Cliente clienteOrigen = clientes.get(nombreClienteOrigen);
        Cliente clienteDestino = clientes.get(nombreClienteDestino);

        if (clienteOrigen != null && clienteDestino != null) {
            Cuenta cuentaOrigen = clienteOrigen.getCuenta(tipoCuentaOrigen);
            Cuenta cuentaDestino = clienteDestino.getCuenta(tipoCuentaDestino);

            if (cuentaOrigen != null && cuentaDestino != null) {
                if (cuentaOrigen.retirar(cantidad)) {
                    cuentaDestino.depositar(cantidad);
                    System.out.println("Transferencia de $" + cantidad + " de " + nombreClienteOrigen + " (" + tipoCuentaOrigen + ") a " + nombreClienteDestino + " (" + tipoCuentaDestino + ") completada.");
                }
            } else {
                System.out.println("Una de las cuentas especificadas no existe.");
            }
        } else {
            System.out.println("Uno de los clientes especificados no existe.");
        }
    }
}


