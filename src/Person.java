public class Person implements Comparable<Person> {
private String name;
private int edad;
private String dni;

    public Person(String name, int edad, String dni) {
        this.name = name;
        this.edad = edad;
        this.dni = dni;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return (this.edad>o.edad ? 1 : -1);
    }
}
