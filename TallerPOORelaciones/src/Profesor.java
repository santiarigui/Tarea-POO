public class Profesor extends Persona {
    private String departamento;

    public Profesor(String nombre, String documento, String departamento) {
        super(nombre, documento);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String obtenerRol() {
        return "Profesor";
    }
}