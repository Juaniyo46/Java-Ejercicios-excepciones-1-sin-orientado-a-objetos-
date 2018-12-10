package es.JuanAntonio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Elija que operación quiere realizar; \n[1] Suma\n[2] Resta\n[3] Multiplicación\n[4] División");

        String option = sc.next();

        System.out.println(option);
      // si opti9o es correcto saco pido los valores y continuo

        if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4")) {
            System.out.println("Introduzca dos valores enteros");
            try {
                int value1 = sc.nextInt();
                int value2 = sc.nextInt();

                //switch según opcion
                // 1 --> suma(value1, value2;

                switch (option) {
                    case "1":
                        System.out.println("Resultado de la suma: " + (value1+value2));
                        break;
                    case "2":
                        System.out.println("Resultado de la resta: " + (value1-value2));
                        break;
                    case "3":
                        System.out.println("Resultado de la Multiplicación: " + (value1*value2));
                        break;
                    case "4":
                        System.out.println("Resultado de la División: " + (value1/value2));
                }

            } catch (InputMismatchException imex) {
                String value1 = sc.next();
                String value2 = sc.next();
                System.out.println(value1 + " o " + value2 + " no es un número entero");
            }
            // si no es correcto mensaje de error y "comienzo"
        } else System.out.println("El número introducido no coincide con el menú");









    }
}
