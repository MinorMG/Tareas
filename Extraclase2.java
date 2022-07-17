/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extraclases;

import javax.swing.JOptionPane;
//Extraclase 2 Minor Jose Monge Gamboa
/**
 *
 * @author Minor
 */
public class Extraclase2 {
    public static void main(String[] args) {
        int anos=Integer.parseInt(JOptionPane.showInputDialog("Digite los anos "
                +"trabajados"));
        int horas=Integer.parseInt(JOptionPane.showInputDialog("Digite las"
                +"horas trabajadas"));
        int salariohora=Integer.parseInt(JOptionPane.showInputDialog("Cuanto se"
                +"le paga por hora?"));
        if (anos>10) {
            int salariob= horas * salariohora;
            int bono=20*(salariob/100);
            int Nsalariob=salariob+bono;
            JOptionPane.showMessageDialog(null,"Su salario es de:"+Nsalariob);
            //--------------------------------------
            if (Nsalariob>2000) {
                int deduccion=15*(Nsalariob/100);
                int salariofinal=Nsalariob - deduccion;
                JOptionPane.showMessageDialog(null,"El salario neto es de:"
                        +salariofinal); 
            //---------------------------------------     
            }else if (Nsalariob>1000) {
                int deduccion=10*(Nsalariob/100);
                int salariofinal=Nsalariob - deduccion;
                JOptionPane.showMessageDialog(null,"El salario neto es de:"
                        +salariofinal);   
            }
        }else{
            int salariob= horas * salariohora;
            JOptionPane.showMessageDialog(null,"El salario es de:"+salariob);  
        }
    }  
}
