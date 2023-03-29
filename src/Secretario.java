public class Secretario extends Empleado {

    private int numHorasExtra;

    public Secretario(String name, int edad, String dni, float salario, int numHorasExtra) {
        super(name, edad, dni, salario);
        this.numHorasExtra = numHorasExtra;
    }

    public Secretario(float salario, int numHorasExtra) {
        super(salario);
        this.numHorasExtra = numHorasExtra;
    }

    @Override
    public float calcularBonificacion() {
        return (this.numHorasExtra * 2f * 40);
    }

    @Override
    public String toString() {

        return super.toString()+"Secretario{" +
                "numHorasExtra=" + numHorasExtra +
                ", salario=" + salario +
                '}';
    }
}
