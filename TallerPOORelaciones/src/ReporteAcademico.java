public class ReporteAcademico {
    // Dependencia: el metodo recibe un Estudiante y lo usa para generar el reporte.
    public void generarReporte(Estudiante estudiante) {
        System.out.println("=== Reporte academico ===");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Documento: " + estudiante.getDocumento());
        System.out.println("Codigo: " + estudiante.getCodigo());
        System.out.println("Rol: " + estudiante.obtenerRol());
    }
}