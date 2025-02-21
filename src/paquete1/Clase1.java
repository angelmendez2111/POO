//Modificadores de acceso

package paquete1;

public class Clase1 {

    private final String name;
    private int age;

    public Clase1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void mostrar() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }
}
