/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes;
import java.util.Scanner;

/**
 *
 * @author Rafael Cuello
 */
public class mensajes {
     public static void main(String args[]){
        //int a=3;
        //int b=2;
        //int res = suma(a,b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String name = sc.nextLine();
        System.out.println("Hola como estás "+name  );
        }
}
