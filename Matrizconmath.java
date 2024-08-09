/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizconmath;

/**
 *
 * @author User
 */
public class Matrizconmath {

    public static void main(String[] args) {
        System.out.println("Matriz de 3x3:");
        System.out.println("es una muy pequena prueba");
                int [][]num;
        int x, y;
        num =new int [3][3];
        for (x=0;x<num.length;x++){
            for (y=0;y<num[x].length;y++){
                num[x][y]=(int)(Math.random()*100);
            }
        }
        for (x=0;x<num.length;x++){
            for (y=0;y<num[x].length;y++){
                System.out.print(num[x][y]+"  ");
            }
            System.out.println("\n");
        }
    }
}