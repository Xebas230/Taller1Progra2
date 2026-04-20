package deitel313.negocio;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String apellido, String nombre, double salario) {
        this.apellido = apellido;
        this.nombre = nombre;
        //si valido o modifico el set ya no solo asigno sino llamo el set
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {

        if (salario>0){
            this.salario = salario;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Nombre; " + nombre + "\nApellido: " + apellido+"\nSalario: " + salario;
    }
}
