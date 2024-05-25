import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiales;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.materiales = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adquirirMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material adquirido: " + material.getTitulo());
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        System.out.println("Material no encontrado.");
        return null;
    }

    public Usuario buscarUsuario(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado.");
        return null;
    }
}
