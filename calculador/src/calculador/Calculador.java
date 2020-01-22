/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP Probook 440 G3
 */
public class Calculador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int N=sc.nextInt();
        System.out.println("Ingrese la potencia");
        int p=sc.nextInt();
        calculador2 obj01 = new calculador2();
        
        System.out.println("El serultado es "+obj01.calcularPotencia(N, p));
    }
    
}

    


