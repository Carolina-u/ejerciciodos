/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posnegceros;
import java.util.Scanner;
/**
 *
 * @author User Natalia C. Diaz Calderón
 */
public class Posnegceros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[20];
        int x, u;
        System.out.println("Ingrese 20 numeros enteros, pueden ser positivos, negativos o ceros:");
        for (x =0; x<20;x++) {
            System.out.print("Numero " + (x+1) + ": ");
            numeros[x] =leer.nextInt();
        }
        int positivos=0, negativos=0, ceros=0;
        for (u =0;u<20;u++) {
            if (numeros[u]< 0) {
                negativos++;
            }else if (numeros[u]>0){
                positivos++;
            }else{
                ceros++;
            }
        }
        System.out.println(positivos+" Positivos.");
        System.out.println(negativos+" Negativos.");
        System.out.println(ceros+" Ceros");
    }
}
