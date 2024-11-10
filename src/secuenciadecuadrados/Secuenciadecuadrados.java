/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciadecuadrados;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Secuenciadecuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("ingresar un numero: ");
    int numero = scanner.nextInt();
    if (numero <= 0){
    System.out.println("ingresar un numero: ");
    }else{
    int i = 1;  
    System.out.println("Los cuadrados de los números desde 1 hasta " + numero + " son:");
    do{
    int cuadrado = i * i;  
    System.out.println("El cuadrado de " + i + " es: " + cuadrado);
    i++;  
    }while (i <= numero); 
        }
    }
}
