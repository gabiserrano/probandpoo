public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto producto1 = new Producto("Laptop", 5, "2024-12-31");
        Producto producto2 = new Producto("Mouse", 20, "2025-12-31");
        Producto producto3 = new Producto("Teclado", 15, "2023-12-31");

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);

        inventario.mostrarInventario();
        System.out.println("-----");

        inventario.recibirMercancia("Laptop", 10);
        inventario.recibirMercancia("Mouse", 5);
        inventario.mostrarInventario();
        System.out.println("-----");

        inventario.seguimientoInventario();
        System.out.println("-----");

        inventario.reabastecerInventario("Teclado", 20);
        inventario.mostrarInventario();
        System.out.println("-----");

        inventario.controlCalidad();
        System.out.println("-----");

        inventario.gestionarObsoletos();
    }
}
