/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromayorarreglo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Numeromayorarreglo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[5];
        int x, u, may;
        System.out.println("Ingrese 5 numeros enteros, vamos a imprimir el numero mayor:");
        for (x =0; x<5;x++) {
            System.out.print("Numero " + (x+1) + ": ");
            numeros[x] =leer.nextInt();
        }
        may=numeros[0]; //asignarnumeromayor
        for (u =1;u<5;u++) {
            if (numeros[u]> may) {
                may=numeros[u];
            }
        }
        System.out.println("El numero mayor del arreglo es: " + may);
    }
}