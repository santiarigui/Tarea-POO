public class EstudianteCalificable implements Calificable {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public EstudianteCalificable(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularNotaFinal() {
        // Ejemplo de ponderacion: 35 %, 35 % y 30 %.
        return nota1 * 0.35 + nota2 * 0.35 + nota3 * 0.30;
    }
}