package org.example;
import java.util.Scanner;
public class Triangulo {
    private static Scanner teclado;
    public static void main(String[] args) {
        //@author Rafael Lopez Gonzalez
        double l1, l2, l3;
        String t= "";
        teclado = new Scanner(System.in);
        System.out.println("Introduce el primer lado del triángulo:");
            l1 = teclado.nextDouble();
        System.out.println("Introduce el segundo lado del triángulo:");
            l2 = teclado.nextInt();
        System.out.println("Introduce el tercer lado del triángulo:");
            l3 = teclado.nextFloat();
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Los lados de un triángulo deben ser positivos.");
        } else if (l1 == l2 && l2 == l3) {
            t="equilátero";
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            t="isósceles";
        } else {
            t="escaleno";
        }
        double perimetro = l1 + l2 +l3;
        System.out.println("El triángulo es "+ t + " y su perímetro es: " + perimetro);
        teclado.close();
    }
}