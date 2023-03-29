public abstract class Empleado extends Person {

    protected float salario;

    public Empleado(String name, int edad, String dni, float salario) {
        super(name, edad, dni);
        this.salario = salario;
    }

    public Empleado(float salario) {
        this.salario = salario;
    }

    public abstract float calcularBonificacion();


}
