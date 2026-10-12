public class Estudiante extends Persona {
    private String codigo;

    public Estudiante(String nombre, String documento, String codigo) {
        super(nombre, documento);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }

    @Override
    public String toString() {
        return nombre + " (codigo: " + codigo + ")";
    }
}