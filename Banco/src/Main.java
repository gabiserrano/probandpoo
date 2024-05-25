public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Agregar clientes
        banco.agregarCliente("Alice");
        banco.agregarCliente("Bob");

        // Abrir cuentas para los clientes
        Cliente alice = banco.getCliente("Alice");
        alice.abrirCuenta("ahorros");
        alice.abrirCuenta("corriente");

        Cliente bob = banco.getCliente("Bob");
        bob.abrirCuenta("ahorros");

        // Mostrar cuentas de clientes
        alice.mostrarCuentas();
        bob.mostrarCuentas();
        System.out.println("-----");

        // Realizar depósitos
        alice.getCuenta("ahorros").depositar(1000);
        alice.getCuenta("corriente").depositar(500);
        bob.getCuenta("ahorros").depositar(1500);

        // Mostrar cuentas después de depósitos
        alice.mostrarCuentas();
        bob.mostrarCuentas();
        System.out.println("-----");

        // Transferencia entre cuentas
        banco.transferir("Alice", "ahorros", "Bob", "ahorros", 200);

        // Mostrar cuentas después de la transferencia
        alice.mostrarCuentas();
        bob.mostrarCuentas();
        System.out.println("-----");

        // Intentar retirar más de lo que se tiene
        alice.getCuenta("corriente").retirar(1000);
        alice.mostrarCuentas();
    }
}
