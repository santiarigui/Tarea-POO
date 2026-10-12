public class Main {
    public static void main(String[] args) {
        // 1. Herencia: Estudiante y Profesor heredan de Persona.
        Estudiante estudiante1 = new Estudiante("Laura Gomez", "102030", "20261001");
        Profesor profesor1 = new Profesor("Carlos Ruiz", "405060", "Ingenieria");

        System.out.println("=== Herencia ===");
        System.out.println(estudiante1.getNombre() + " - " + estudiante1.obtenerRol());
        System.out.println(profesor1.getNombre() + " - " + profesor1.obtenerRol());

        // 2. Interfaz: EstudianteCalificable implementa Calificable.
        EstudianteCalificable estudianteNota =
                new EstudianteCalificable("Laura Gomez", 4.0, 4.5, 4.2);
        System.out.printf("%n=== Interfaz ===%nNota final de %s: %.2f%n",
                estudianteNota.getNombre(), estudianteNota.calcularNotaFinal());

        // 3. Dependencia: ReporteAcademico usa temporalmente un Estudiante.
        System.out.println();
        ReporteAcademico reporte = new ReporteAcademico();
        reporte.generarReporte(estudiante1);

        // 4. Muchos a muchos: un estudiante puede matricular varios cursos
        // y un curso puede tener varios estudiantes.
        Curso cursoJava = new Curso("Programacion en Java", "POO101");
        Curso cursoMatematicas = new Curso("Matematicas", "MAT101");
        Estudiante estudiante2 = new Estudiante("Andres Perez", "203040", "20261002");

        Matricula m1 = new Matricula(estudiante1, cursoJava);
        Matricula m2 = new Matricula(estudiante1, cursoMatematicas);
        Matricula m3 = new Matricula(estudiante2, cursoJava);

        System.out.println("\n=== Asociacion muchos a muchos ===");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println("Matriculas en Java: " + cursoJava.getMatriculas().size());
    }
}