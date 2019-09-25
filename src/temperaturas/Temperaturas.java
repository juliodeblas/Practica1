/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 2
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temperatura = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1.Introducir temperaturas");
            System.out.println("2.Mostrar temperaturas");
            System.out.println("3.Ordenar temperaturas");
            System.out.println("4.Mostrar extremos");
            System.out.println("5.Mostar medias");
            System.out.println("6.Salir");
            System.out.printf("Introduzca la opción que desee: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    double t1;
                    System.out.println("Introduzca una temperatura: ");
                    t1 = sc.nextDouble();
                    temperatura.add(t1);
                    break;
                case 2:
                    for (Double item : temperatura) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    Collections.sort(temperatura);
                    break;
                case 4:
                    Collections.sort(temperatura);
                    System.out.printf("La temperatura más baja son %f ºC y la más alta %f ºC\n", temperatura.get(0), temperatura.get(temperatura.size() - 1));
                    break;
                case 5:
                    double total = 0;
                    double media = 0;

                    for (int i = 0; i < temperatura.size(); i++) {
                        total += temperatura.get(i);
                        media = total / temperatura.size();
                    }
                    System.out.printf("La media de temperaturas es: %f \n", media);
                    break;
                case 6:

                    break;
                default:
                    System.out.println("Introduzca una opción válida.");
                    break;
            }
        } while (opcion != 6);

    }

}