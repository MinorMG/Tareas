/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Extraclases;

import javax.swing.JOptionPane;

/**
 *
 * @author Minor
 */
public class Extraclase1 {

    public static void main(String[] args) {
        //Extraclase 1 Minor Jose Monge Gamboa
        String nombre="";
        nombre=JOptionPane.showInputDialog("Digite el nombre del empleado");
        int salarioSem=Integer.parseInt(JOptionPane.showInputDialog(
                "Salario Semanal:"));
        
        int salarioMen=salarioSem*4;
        
        int deducciones=9*(salarioMen/100);
    
        int salarioT=salarioMen-deducciones;
        
        JOptionPane.showMessageDialog(null,"Empleado:"+nombre+"El salario Bruto es de:"
                +salarioMen+" Las deducciones son de:"+deducciones+
                " El salario Neto es de:"+salarioT );
        }
        
    }

