public class Main {
    public static void main(String[] args) {
        // Crear programas académicos
        ProgramaAcademico carreraInformatica = new ProgramaAcademico("Ingeniería Informática", "Carrera de pregrado en informática");
        ProgramaAcademico posgradoIA = new ProgramaAcademico("Maestría en Inteligencia Artificial", "Programa de posgrado en IA");

        // Crear cursos
        Curso cursoProg1 = new Curso("Programación I", "Introducción a la programación en Java", "PROG101", 4);
        Curso cursoBD = new Curso("Bases de Datos", "Diseño y gestión de bases de datos relacionales", "BD202", 3);

        // Crear profesores
        Profesor prof1 = new Profesor("Juan Pérez", "Inteligencia Artificial", "Departamento de Computación");
        Profesor prof2 = new Profesor("María Gómez", "Programación", "Departamento de Ingeniería de Sistemas");

        // Crear estudiantes
        Estudiante est1 = new Estudiante("Ana García", "Ingeniería Informática", 5);
        Estudiante est2 = new Estudiante("Pedro Martínez", "Maestría en IA", 2);

        // Crear investigaciones
        Investigacion inv1 = new Investigacion("Desarrollo de algoritmos para reconocimiento facial", "Investigación en visión por computadora", "Inteligencia Artificial");
        Investigacion inv2 = new Investigacion("Impacto de las redes sociales en el comportamiento humano", "Análisis sociológico", "Ciencias Sociales");

        // Crear actividades de extensión
        ActividadExtension cursoContinuo = new ActividadExtension("Curso de Programación Avanzada", "Curso abierto a la comunidad");
        ActividadExtension conferenciaIA = new ActividadExtension("Conferencia sobre Inteligencia Artificial", "Evento académico abierto");

        // Crear servicios estudiantiles
        ServicioEstudiantil servicioSalud = new ServicioEstudiantil("Servicio de Salud Estudiantil", "Consulta médica y servicios de salud mental");
        ServicioEstudiantil deportes = new ServicioEstudiantil("Programa de Deportes", "Instalaciones deportivas y actividades recreativas");

        // Mostrar información básica
        System.out.println("Información básica de la universidad:");
        System.out.println("Programa académico: " + carreraInformatica.getNombre());
        System.out.println("Curso: " + cursoProg1.getNombre() + " (" + cursoProg1.getCodigo() + ")");
        System.out.println("Profesor: " + prof1.getNombre());
        System.out.println("Estudiante: " + est1.getNombre());
        System.out.println("Investigación: " + inv1.getTitulo());
        System.out.println("Actividad de extensión: " + cursoContinuo.getNombre());
        System.out.println("Servicio estudiantil: " + servicioSalud.getNombre());
    }
}
