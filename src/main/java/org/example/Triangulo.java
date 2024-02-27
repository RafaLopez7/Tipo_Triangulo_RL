package org.example;
import java.util.Scanner;
public class Triangulo {
    private static Scanner teclado;
    public static void main(String[] args) {
        //@author Rafael Lopez Gonzalez
        double Lado1, Lado2, Lado3;
        String t= "";
        teclado = new Scanner(System.in);
        System.out.println("Introduce el primer lado del triángulo:");
            Lado1 = teclado.nextDouble();
        System.out.println("Introduce el segundo lado del triángulo:");
            Lado2 = teclado.nextInt();
        System.out.println("Introduce el tercer lado del triángulo:");
            Lado3 = teclado.nextFloat();
        if (Lado1 <= 0 || Lado2 <= 0 || Lado3 <= 0) {
            System.out.println("Los lados de un triángulo deben ser positivos.");
        } else if (Lado1 == Lado2 && Lado2 == Lado3) {
            t="equilátero";
        } else if (Lado1 == Lado2 || Lado1 == Lado3 || Lado2 == Lado3) {
            t="isósceles";
        } else {
            t="escaleno";
        }
        double PerimetroDelTriangulo = Lado1 + Lado2 +Lado3;
        System.out.println("El triángulo es "+ t + " y su perímetro es: " + PerimetroDelTriangulo);
        teclado.close();
    }
}