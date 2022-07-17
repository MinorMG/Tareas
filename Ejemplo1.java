/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos_Ejem;

import javax.swing.JOptionPane;

/**
 *
 * @author Minor
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        int ventas[] = new int[5];

        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la"
                    + " venta"+i));

        }
        int sumaventas = 0;
        for (int i = 0; i < ventas.length; i++) {
            sumaventas += ventas[i];
        }
        JOptionPane.showMessageDialog(null,"la suma de todas las vetas es de"
                + sumaventas);
    }
}
