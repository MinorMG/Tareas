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
public class Ejemplo2Bidimensional {
    //solicitar tamanio del usuario
    public static void main(String[] args) {
       
        int tamanoFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                + "la cantidad de Filas:"));
        int tamanoColum = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                + "la cantidad de columnas:"));
        int usuario[][] = new int[tamanoFilas][tamanoColum];
        //rellenamos el arreglo ------------------------------------------------
        for (int i = 0; i < usuario.length; i++) {
            for (int j = 0; j < usuario.length; j++) {
                usuario[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite tamanio para la fila" + i + "columna:" + j));
            }
        }
        //calcular suma de las esquinas
        int sumaesquinas = usuario[0][0]/*la primera casilla izquierda*/
                + usuario[0][usuario[0].length - 1]/*izquierda abajo*/
                + usuario[usuario.length - 1][0] /*derecha arriba*/
                + usuario[usuario.length - 1][usuario[usuario.length - 1].length - 1];
        //derecha abajo -----//\\-----
        JOptionPane.showMessageDialog(null, "La suma esquinas:" + sumaesquinas);
        //----------------------------------------------------------------------
        //Numero mayor del arreglo
        int numMay = usuario[0][0];
        for (int i = 0; i < usuario.length; i++) {
            for (int j = 0; j < usuario[i].length; j++) {
                if (usuario[i][j] > numMay) {
                    numMay = usuario[i][j];
                }
            }
        }
        //suma diagonal
        //------------------------------
        //suma diagonal invertida
        //------------------------------
   
    }
}
