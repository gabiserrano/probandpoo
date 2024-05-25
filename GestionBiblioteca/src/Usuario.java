import java.util.ArrayList;
import java.util.List;
public class Usuario {
    private String nombre;
    private List <Material> materialesPrestados;
    public Usuario(String nombre){
        this.nombre = nombre;
        this.materialesPrestados = new ArrayList<>();
    }
    public String getNombre(){
        return this.nombre;
    }
    public List <Material> getMaterialesPrestados(){
        return materialesPrestados;
    }
    public void prestarMaterial(Material material){
        if (!material.isEstaPrestado()){
            material.prestar();
            materialesPrestados.add(material);
        } else {
            System.out.println("El material ya esta prestado");
        }
    }
    public void devolverMaterial(Material material){
        if (materialesPrestados.contains(material)){
            material.devolver();
            materialesPrestados.remove(material);
        } else {
            System.out.println("Este material no fue prestado por este usuario. ");

        }
    }
}
