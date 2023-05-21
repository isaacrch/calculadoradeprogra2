package calculadora.de.programacion2;

import java.util.Scanner;

public class procesos {

    private static Scanner leer = new Scanner(System.in);

    public static void sumar() {

        float num1 = 0, num2 = 0, total;
        System.out.println("Digite un numero");
        num1 = leer.nextFloat();
        System.out.println("Digite otro numero");
        num2 = leer.nextFloat();

        total = num1 + num2;
        System.out.println("El resultado de la suma es: " + total);

    }

    public static void restar() {
        float num1 = 0, num2 = 0, total;
        System.err.println("Digite un numero");
        num1 = leer.nextFloat();
        System.out.println("Digite otro numero");
        num2 = leer.nextFloat();
        total = num1 - num2;
        System.out.println("El resultado de la resta es: " + total);

    }

    public static void multiplicar() {
        float num1 = 0, num2 = 0, total;
        System.out.println("Digite un  numero");
        num1 = leer.nextFloat();
        System.out.println("Digite otro numero");
        num2 = leer.nextFloat();
        total = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + total);

    }

    public static void dividir() {
        float num1 = 0, num2 = 0, total;
        System.out.println("Digite un  numero");
        num1 = leer.nextFloat();
        System.out.println("Digite otro numero");
        num2 = leer.nextFloat();
        total = num1 / num2;
        System.out.println("El resultado de la division es: " + total);

    }
}
