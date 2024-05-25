import java.util.ArrayList;
import java.util.List;

public class RecursosHumanos {

    private List<Empleado> empleados;

    public RecursosHumanos() {
        this.empleados = new ArrayList<>();
    }

    // Reclutamiento y selección
    public void reclutarYSeleccionar(String nombre, String puesto) {
        Empleado nuevoEmpleado = new Empleado(nombre, puesto);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado reclutado y seleccionado: " + nombre);
    }

    // Contratación y orientación
    public void contratarYOrientar(String nombre) {
        Empleado empleado = buscarEmpleado(nombre);
        if (empleado != null && !empleado.isContratado()) {
            empleado.contratar();
            System.out.println("Empleado contratado y orientado: " + nombre);
        } else {
            System.out.println("Empleado no encontrado o ya contratado.");
        }
    }

    // Desarrollo y formación
    public void desarrollarYFormar(String nombre) {
        Empleado empleado = buscarEmpleado(nombre);
        if (empleado != null && empleado.isContratado()) {
            System.out.println("Desarrollo y formación proporcionada para: " + nombre);
            // Aquí puedes agregar más detalles sobre los programas de formación
        } else {
            System.out.println("Empleado no encontrado o no contratado.");
        }
    }

    // Evaluación del desempeño
    public void evaluarDesempeno(String nombre) {
        Empleado empleado = buscarEmpleado(nombre);
        if (empleado != null && empleado.isContratado()) {
            System.out.println("Evaluación de desempeño realizada para: " + nombre);
            // Aquí puedes agregar más detalles sobre la evaluación
        } else {
            System.out.println("Empleado no encontrado o no contratado.");
        }
    }

    // Gestión del rendimiento y la compensación
    public void gestionarRendimientoYCompensacion(String nombre) {
        Empleado empleado = buscarEmpleado(nombre);
        if (empleado != null && empleado.isContratado()) {
            System.out.println("Rendimiento y compensación gestionados para: " + nombre);
            // Aquí puedes agregar más detalles sobre la gestión del rendimiento
        } else {
            System.out.println("Empleado no encontrado o no contratado.");
        }
    }

    // Gestión del ausentismo y la disciplina
    public void gestionarAusentismoYDisciplina(String nombre) {
        Empleado empleado = buscarEmpleado(nombre);
        if (empleado != null && empleado.isContratado()) {
            System.out.println("Ausentismo y disciplina gestionados para: " + nombre);
            // Aquí puedes agregar más detalles sobre la gestión del ausentismo
        } else {
            System.out.println("Empleado no encontrado o no contratado.");
        }
    }

    // Desvinculación
    public void desvincular(String nombre) {
        Empleado empleado = buscarEmpleado(nombre);
        if (empleado != null && empleado.isContratado()) {
            empleado.desvincular();
            System.out.println("Empleado desvinculado: " + nombre);
        } else {
            System.out.println("Empleado no encontrado o no contratado.");
        }
    }

    // Método auxiliar para buscar empleados por nombre
    private Empleado buscarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }
}
