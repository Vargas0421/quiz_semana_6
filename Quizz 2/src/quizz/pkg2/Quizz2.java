/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz.pkg2;

/**
 *
 * @author LABORATORIO 04
 */
import javax.swing.JOptionPane;
public class Quizz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x;
        int trabajadores;  
        x = JOptionPane.showInputDialog("Introduzca la cantidad de trabajadores");    
        trabajadores = Integer.parseInt(x);
        double salario = 0;

            for (int i = 0; i < trabajadores; i++) {
            String y;
            double salario2;  
            y = JOptionPane.showInputDialog("introduzca el salario de cada trabajor en orden");    
            salario2 = Integer.parseInt(y);
            
            salario2 = salario2 *0.1433;
                    
            salario = salario + salario2; 
            }

            System.out.println("el total que le deben de pagar a la CSS es de " + salario + "colones");
    }
    
}
