public class Matricula {
    private Estudiante estudiante;
    private Curso curso;

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
        curso.agregarMatricula(this);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return estudiante.getNombre() + " esta matriculado en " + curso.getNombre();
    }
}