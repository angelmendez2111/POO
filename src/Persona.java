
public class Persona {

    String nombre;
    int edad;
    int dni;
    String apellido;

    public Persona() {
    }

    public Persona(int dni) {
        this.dni = dni;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Apellido: " + apellido);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
