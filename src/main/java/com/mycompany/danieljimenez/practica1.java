/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danieljimenez;

import java.util.*;

/**
 *
 * @author usuario
 */
public class practica1 {
    
    public static void main(String[] args) {
        
   
Scanner reader = new Scanner(System.in);
System.out.println("Introduzca un número");
int numero = reader.nextInt();
if(numero%2==0) {
System.out.println("El número es par");
} else {
System.out.println("El número es impar");
}
reader.close();
}

}