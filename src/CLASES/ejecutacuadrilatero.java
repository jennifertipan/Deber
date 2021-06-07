package CLASES;

import java.util.Scanner;

public class ejecutacuadrilatero {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int a;
        int b, c;
        System.out.println("Va a ingresar un cuadrado o un rectangulo:" + "1=cuadrado  2=rectangulo");
        a = e.nextInt();
        if (a == 1) {
            System.out.println("Ingres el valor de uno de los lados:");
            b = e.nextInt();
            cuadrilatero c1 = new cuadrilatero(b, b);
            System.out.println("El perimetro es:" + c1.perimetro());
            System.out.println("El area es: " + c1.area());
        }
        if (a == 2) {
            System.out.println("Ingrese el ancho del rectangulo: ");
            b = e.nextInt();
            System.out.println("Ingres el largo del rectangulo: ");
            c = e.nextInt();
            cuadrilatero c2 = new cuadrilatero(b, c);
            System.out.println("El perimetro es:" + c2.perimetro());
            System.out.println("El area es: " + c2.area());
        }

    }

}
