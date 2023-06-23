/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_evasalgado;

import javax.swing.JOptionPane;

/**
 *
 * @author evaja
 */
public class tictactoe {
//  Imprimir  tablero
    public void imprimirMatriz(String[][] matriz) {
        Tablero(matriz, 0, 0, "");
    }
//  Generar de Tablero
    private void Tablero(String[][] matriz, int fila, int columna, String Imprimir) {
        
        if (fila >= matriz.length) {
            JOptionPane.showMessageDialog(null, Imprimir);
            return;
        }
        String nonull = matriz[fila][columna];//string para eliminar null
        if (nonull==null) {
            nonull = " ";
        }
        
        Imprimir += "["+nonull+"]";
        if (columna < matriz[fila].length - 1) {
            Tablero(matriz, fila, columna + 1, Imprimir);
        } else {
            Imprimir+="\n";
            Tablero(matriz, fila + 1, 0, Imprimir);
        }
    }
}
