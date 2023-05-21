package calculadora.de.programacion2;

import java.util.Scanner;

public class menu {

    private byte opcion;
    public Scanner leer = new Scanner(System.in);

    public menu() {

        opcion = 0;
    }

    public void mostrar() {

        do {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    procesos.sumar();
                    break;
                case 2:
                    procesos.restar();
                    break;
                case 3:
                    procesos.multiplicar();
                    break;
                case 4:
                    procesos.dividir();
                    break;

                default:
                   // throw new AssertionError();
            }

        } while (opcion!=5);

    }

}
