package ejercicios.perimetro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero c1;
        //Cuadrilatero c2 = new Cuadrilatero(41);
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de lado 2: "));

        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println(c1.getPerimetro());
        System.out.println(c1.getArea());

    }
}
