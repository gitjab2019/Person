public class Gerente extends Empleado{
private String departamento;

    public Gerente(String name, int edad, String dni, float salario, String departamento) {
        super(name, edad, dni, salario);
        this.departamento = departamento;
    }

    public Gerente(float salario, String departamento) {
        super(salario);
        this.departamento = departamento;
    }

    @Override
    public float calcularBonificacion() {
        return(1.25f * this.salario);
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente{" +
                "departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }
}
