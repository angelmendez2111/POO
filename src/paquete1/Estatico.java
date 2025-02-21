package paquete1;

public class Estatico {

    private static String frase = "Primera frase";

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Estatico e = new Estatico();
        frase = "Primera frase modificada";
        System.out.println(sumar(4, 5));
        System.out.println(frase);
    }
}
