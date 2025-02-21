public class Coche {

    //Atributos
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.color = "red";
        coche.marca = "toyota";
        coche.km = 10;
        System.out.println(coche.color);
        System.out.println(coche.marca);
        System.out.println(coche.km);


    }

}
