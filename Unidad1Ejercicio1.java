/*
 * Actividad: Desarrollo de Software a través de distintas Etapas.
 * El Mayor de Tres: Crea un programa que solicite tres números al usuario e indique cuál es el mayor.
 */
package unidad1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author UsuarioDAW
 */
public class Unidad1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, mayor;
        System.out.println("Introduzca un número");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        num2 = sc.nextInt();
        System.out.println("Introduzca otro número");
        num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }   
        System.out.println("El mayor es: " + mayor);
        
    }
    
}
