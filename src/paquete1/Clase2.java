package paquete1;

public class Clase2 {

    public static void main(String[] args) {

        Clase1 persona1 = new Clase1("Angel", 21);
        persona1.mostrar();

        persona1.setAge(22);
        persona1.mostrar();

        System.out.println(persona1.getAge());
        System.out.println(persona1.getName());
    }
}
