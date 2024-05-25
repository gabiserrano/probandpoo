public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        // Crear proveedores y agregar ingredientes
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        proveedor1.agregarIngrediente(new Ingrediente("Tomate", 50));
        proveedor1.agregarIngrediente(new Ingrediente("Lechuga", 30));

        Proveedor proveedor2 = new Proveedor("Proveedor 2");
        proveedor2.agregarIngrediente(new Ingrediente("Pollo", 20));
        proveedor2.agregarIngrediente(new Ingrediente("Queso", 40));

        restaurante.agregarProveedor(proveedor1);
        restaurante.agregarProveedor(proveedor2);

        // Abastecer la cocina
        restaurante.abastecerCocina();

        // Mostrar inventario de la cocina
        System.out.println("Inventario inicial de la cocina:");
        restaurante.mostrarInventarioCocina();
        System.out.println("--------------------------------------");

        // Crear platos
        Plato plato1 = new Plato("Ensalada");
        plato1.agregarIngrediente(new Ingrediente("Tomate", 2));
        plato1.agregarIngrediente(new Ingrediente("Lechuga", 1));
        plato1.agregarIngrediente(new Ingrediente("Queso", 1));

        Plato plato2 = new Plato("Pollo Asado");
        plato2.agregarIngrediente(new Ingrediente("Pollo", 1));
        plato2.agregarIngrediente(new Ingrediente("Queso", 1));

        // Preparar platos
        System.out.println("\nPreparando platos...");
        restaurante.prepararPlato(plato1);
        restaurante.prepararPlato(plato2);
        System.out.println("--------------------------------------");

        // Mostrar inventario de la cocina después de preparar los platos
        System.out.println("\nInventario de la cocina después de preparar los platos:");
        restaurante.mostrarInventarioCocina();
    }
}

