public class Material {
    private String titulo;
    private String tipo;
    private boolean estaPrestado;

    public Material (String titulo, String tipo){
        this.titulo = titulo;
        this.tipo = tipo;
        this.estaPrestado = false;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getTipo(){
        return tipo;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void prestar (){
        if (!estaPrestado){
            estaPrestado = true;
        } else {
            System.out.println("El material ya esta prestado.");
        }
    }
    public void devolver(){
        estaPrestado = false;
    }
}
