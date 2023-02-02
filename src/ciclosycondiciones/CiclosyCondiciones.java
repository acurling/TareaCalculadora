package ciclosycondiciones;

import java.util.Scanner;

public class CiclosyCondiciones {

    /*
    &&  Y
    ||  o
    !   NOT = NEGACION
    =   Asignar
    ==  Comparacion
    %   residuo
    +  suma
    - resta
    / division
    * multiplicacion
    >  mayor que
    >= mayor o igual que
    <  menor que
    <= menor o igual que
    
     */
    /**
     * METODOS (void) Y FUNCIONES *
     */
    public static void main(String[] args) {
     menu(); 
    }

    public static void ciclowhile() {
        int x = 0;
        while (x <= 20) {
            if ((x > 5) && (x < 10)) {
                System.out.println("valor " + x);
            }
            x = x + 1;
        }
    }

    public static void ciclodowhile() {
        Scanner leer = new Scanner(System.in);

        byte opcion = 0;
        do {
            System.out.println("1-Sumar");
            System.out.println("2-restar");
            System.out.println("3-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
        } while (opcion != 3);

    }

    public static void Condicionswitch() {
        Scanner leer = new Scanner(System.in);
        byte dia = 0;
        System.out.println("Digite el dia");
        dia = leer.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
              
            default:
                System.out.println("Dia invalido");
        }

    }

    public static void menu() {
       Scanner leer = new Scanner(System.in);

        byte opcion = 0;
        do {
            System.out.println("1-Sumar");
            System.out.println("2-restar");
            System.out.println("3-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1: sumar();
                    break;
                    case 2: restar();
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (opcion != 3);
    }

    public static void sumar() {
        float total;
        total = 5 + 6;
        System.out.println("total suma: " + total);
    }

    public static void restar() {
        float total;
        total = 5 - 6;
        System.out.println("total resta: " + total);
    }

    public static void CondicionIf() {
        int num1, num2, num3;
        num1 = 6;
        num2 = 7;
        num3 = 9;
        /// condicion IF  ELSE  ELSE FI
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " es mayor ");
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println(num3 + " es mayor ");
        } else if ((num1 == num2) && (num2 == num3)) {
            System.out.println(" los tres numeros son iguales ");
        }
    }

}
