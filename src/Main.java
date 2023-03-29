import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

     ArrayList<Person> listaPersonas=new ArrayList<>();

     Person persona1=new Person("Paula",9,"51972052");
     Person persona2=new Person("Victoria",10,"51972051");
     Person persona3=new Person("Ana",41,"16607109");
     Secretario sec1=new Secretario("Jane",33,"19777109",3900, 30);
     Secretario sec2=new Secretario("Roxi",28,"19777999",3900, 10);
     Gerente gerente1=new Gerente("Lisa",32,"77777999",790,"Gerencia");


     listaPersonas.add(persona1);
     listaPersonas.add(persona3);
     listaPersonas.add(persona2);
     listaPersonas.add(sec1);
     listaPersonas.add(sec2);
     listaPersonas.add(gerente1);

     for(Person p:listaPersonas)
         System.out.println(p);

        Collections.sort(listaPersonas);
     System.out.println();
     System.out.println("==<Lista Ordenada Por Edad>==");
     for(Person p:listaPersonas)
        System.out.println(p);



    }
}