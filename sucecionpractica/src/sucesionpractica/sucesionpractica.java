/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sucesionpractica;

import java.util.Scanner;

/**
 *
 * @author Dsilv
 */
public class sucesionpractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, sum, i;
        float g, numerador, denominador;
        for (n = 1; n <= 6; n++) {
            numerador = 2 * n + 1;
            denominador = 2 * n + 2;
            if (n == 3) {
                System.out.println("Para g(3) el valor de la sucesión es " + numerador + "/" + denominador);
            }
        }
    }

}
