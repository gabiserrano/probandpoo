public class Main {
    public static void main(String[] args) {
        RecursosHumanos departamentoRRHH = new RecursosHumanos();

        // Reclutamiento y selección
        System.out.println("----- Reclutamiento y Selección -----");
        departamentoRRHH.reclutarYSeleccionar("Carlos Martínez", "Desarrollador");
        departamentoRRHH.reclutarYSeleccionar("Ana López", "Diseñadora");
        System.out.println();

        // Contratación y orientación
        System.out.println("----- Contratación y Orientación -----");
        departamentoRRHH.contratarYOrientar("Carlos Martínez");
        System.out.println();

        // Desarrollo y formación
        System.out.println("----- Desarrollo y Formación -----");
        departamentoRRHH.desarrollarYFormar("Carlos Martínez");
        System.out.println();

        // Evaluación del desempeño
        System.out.println("----- Evaluación del Desempeño -----");
        departamentoRRHH.evaluarDesempeno("Carlos Martínez");
        System.out.println();

        // Gestión del rendimiento y la compensación
        System.out.println("----- Gestión del Rendimiento y la Compensación -----");
        departamentoRRHH.gestionarRendimientoYCompensacion("Carlos Martínez");
        System.out.println();

        // Gestión del ausentismo y la disciplina
        System.out.println("----- Gestión del Ausentismo y la Disciplina -----");
        departamentoRRHH.gestionarAusentismoYDisciplina("Carlos Martínez");
        System.out.println();

        // Desvinculación
        System.out.println("----- Desvinculación -----");
        departamentoRRHH.desvincular("Carlos Martínez");
        System.out.println();
    }
}

