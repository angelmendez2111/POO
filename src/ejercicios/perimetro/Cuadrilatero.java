package ejercicios.perimetro;

public class Cuadrilatero {
    private double lado1;
    private double lado2;

    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(double lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {

        return (float) (2 * (lado1 + lado2));
    }

    public float getArea() {
        return (float) (lado1 * lado2);
    }

}
