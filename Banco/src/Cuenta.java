public class Cuenta {
    private String tipo;
    private double saldo;

    public Cuenta(String tipo) {
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depositados $" + cantidad + " en la cuenta " + tipo);
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retirados $" + cantidad + " de la cuenta " + tipo);
            return true;
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
