//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Material libro1 = new Material ("El quijote", "Libro");
        Material revista1 = new Material ("National Geographic", "Revista");
        biblioteca.adquirirMaterial(libro1);
        biblioteca.adquirirMaterial(revista1);

        Usuario usuario1 = new Usuario("Juan Molina");
        biblioteca.registrarUsuario(usuario1);

        usuario1.prestarMaterial(libro1);

        usuario1.devolverMaterial(libro1);

        }
    }
