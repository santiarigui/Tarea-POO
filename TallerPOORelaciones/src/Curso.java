import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    private List<Matricula> matriculas;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.matriculas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void agregarMatricula(Matricula matricula) {
        if (!matriculas.contains(matricula)) {
            matriculas.add(matricula);
        }
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}