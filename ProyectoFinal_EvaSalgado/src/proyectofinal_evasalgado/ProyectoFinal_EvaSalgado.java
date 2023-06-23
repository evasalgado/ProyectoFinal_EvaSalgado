/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal_evasalgado;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import proyectofinal_evasalgado.cutscenes.sprites.*;

/**
 *
 * @author evaja
 */
public class ProyectoFinal_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    static proyectofinal_evasalgado.cutscenes.sprites.sprite1 sprite1 = new sprite1();
    static proyectofinal_evasalgado.cutscenes.sprites.sprite8 sprite8 = new sprite8();
    static proyectofinal_evasalgado.cutscenes.sprites.sprite9 sprite9 = new sprite9();
    static ArrayList<menu_orden> orden = new ArrayList<>();
    static Random alea = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Inicio start = new Inicio();
        start.setVisible(true);

    }
// ordenar
    public static void ordenar() {
        int resp = 1;
        int opcion = 0; //opcion a ordenar 
        String objeto = " ";//nombre del objeto del menu

        JOptionPane.showMessageDialog(null, "Para ordenar, debes ingresar el numero del objeto a ordenar.");
        while (resp == 1 || resp == 1) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingresa lo que ordenaras: "));

            int precio = 0; //precio de lo que quieres

            switch (opcion) {
                case 1:
                    objeto = "Cafe simple";
                    precio = 25;
                    break;
                case 2:
                    objeto = "Cappuchino";
                    precio = 45;
                    break;
                case 3:
                    objeto = "Latte";
                    precio = 35;
                    break;
                case 4:
                    objeto = "Croissant";
                    precio = 30;
                    break;
                case 5:
                    objeto = "Dona Glaceada";
                    precio = 20;
                    break;
                case 6:
                    objeto = "Muffin";
                    precio = 15;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Lo lamento, pero eso no esta en nuestro menu");
                    break;
            }
            menu_orden order = new menu_orden(objeto, precio);
            orden.add(order);
            resp = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar algo mas?[1/0]: "));
        }

    }
    //total de tu orden
    public static int totalOrden() {
        int total = 0;
        for (menu_orden order : orden) {
            total += order.getPrecio();
        }
        return total;
    }
//  tu orden final
    public static void ordenfinal() {
        int resp = 3;
        sprite8.setVisible(true);
        JOptionPane.showMessageDialog(null, "Aki: Bueno, esta es su orden final, dejeme saber si la he dicho bien: ");

        for (int i = 0; i < orden.size(); i++) {
            JOptionPane.showMessageDialog(null, orden.get(i));
        }
        JOptionPane.showMessageDialog(null, "su total seria: lps. " + totalOrden());
        resp = Integer.parseInt(JOptionPane.showInputDialog("Es correcta su orden?[1/0]"));
        while (resp != 0 || resp != 1) {
            if (resp == 1) {
                sprite8.dispose();
                sprite1.setVisible(true);
                JOptionPane.showMessageDialog(null, "Aki: Perfecto, se le traera muy pronto su orden. Por mientras puedes jugar esto");
                sprite1.dispose();
                orden.removeAll(orden);
                break;
            } else if (resp == 0) {
                sprite8.dispose();
                sprite9.setVisible(true);
                JOptionPane.showMessageDialog(null, "Aki: Oh...");
                JOptionPane.showMessageDialog(null, "Aki: Puede que halla añadido algo que no debia...Tu solo dime que elimino");
                eliminarobjeto();
                sprite9.setVisible(true);
                JOptionPane.showMessageDialog(null, "Aki: Perdoname, a veces me distraigo...");
                JOptionPane.showMessageDialog(null, "Aki: Toma, Juega esto mientras esperas.");
                orden.removeAll(orden);
                sprite9.dispose();
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Aki: Como que no te entiendo, puedes repetir?");
                resp = Integer.parseInt(JOptionPane.showInputDialog("Es correcta su orden?[1/0]"));
            }
        }
    }
//  eliminar algo de tu orden
    public static void eliminarobjeto() {
        int resp = 1;
        boolean encontrado = false;

        while (resp == 1) {
            sprite9.dispose();
            sprite8.setVisible(true);
            String objeto = JOptionPane.showInputDialog("¿Qué es lo que deseas eliminar?");
            for (int i = 0; i < orden.size(); i++) {
                if (orden.get(i).objetoorden.equals(objeto)) {
                    JOptionPane.showMessageDialog(null, "Aki: ¡Listo, ha sido eliminado de tu orden!");
                    orden.remove(i);
                    encontrado = true;
                    sprite8.dispose();
                    break; // Salir del bucle for una vez que se encuentre y elimine el objeto
                }
            }

            if (!encontrado) {
                sprite9.setVisible(true);
                JOptionPane.showMessageDialog(null, "Aki: Hmm....eso no se encuentra en tu orden.");
                sprite9.dispose();
            }
            sprite8.setVisible(true);
            resp = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas eliminar algo más? [1/0]:"));
            encontrado = false; // Reiniciar la bandera para la siguiente iteración
            sprite8.dispose();
        }
    }
//  generar juego de X-O
    public static void TicTacToe() {
        tictactoe juego = new tictactoe();
        String[][] tablero = new String[3][3];
        boolean winner=false;
        int cont = 0;
        int fO, cO, fX, cX;
        do {
            fO = alea.nextInt(0, 2);
            cO = alea.nextInt(0, 2);
            if (fO >= 0 && fO < tablero.length && cO >= 0 && cO < tablero[fO].length) {

                if (tablero[fO][cO] == null) {
                    tablero[fO][cO] = "O";
                } else {
                    continue;
                }
                winner=ganador(tablero, "O");
                
                if(winner==true){
                    JOptionPane.showMessageDialog(null, "Gracias por jugar! Tu pedido ya esta listo!");
                    break;
                }
            }

            juego.imprimirMatriz(tablero);

            fX = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de su fila [0-2]: "));
            cX = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de su columna [0-2]: "));
            if (fX >= 0 && fX < tablero.length && cX >= 0 && cX < tablero[fX].length) {

                if (tablero[fX][cX] == null) {
                    tablero[fX][cX] = "X";
                } else if (tablero[fX][cX].equalsIgnoreCase("O") || tablero[fX][cX] == "O") {
                    JOptionPane.showMessageDialog(null, "Lo lamento, pero el éspacio ya está tomado");
                } else if (tablero[fX][cX].equalsIgnoreCase("X") || tablero[fX][cX] == "X") {
                    JOptionPane.showMessageDialog(null, "Ya ingresaste en este espacio");
                } else {
                    JOptionPane.showMessageDialog(null, "Coordenadas inválidas o casilla ocupada. Por favor, ingrese valores válidos.");
                }
                winner=ganador(tablero, "X");
                
                if(winner==true){
                    JOptionPane.showMessageDialog(null, "Gracias por jugar! Tu pedido ya esta listo!");
                    break;
                }
            }
            cont++;
        } while (winner==false);

    }
//  Generador de Ganador
    public static boolean ganador(String[][] matriz, String winner) {
        boolean win = false;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == winner && matriz[i][1] == winner && matriz[i][2] == winner) {
                JOptionPane.showMessageDialog(null, "*Redoble de tambores* " + winner + " es el ganador!");
                win = true;
            }
        }
        for (int j = 0; j < matriz[0].length; j++) {
            if (matriz[0][j] == winner && matriz[1][j] == winner && matriz[2][j] == winner) {
                JOptionPane.showMessageDialog(null, "*Redoble de tambores* " + winner + " es el ganador!");
                win = true;
            }
        }
        if ((matriz[0][0] == winner && matriz[1][1] == winner && matriz[2][2] == winner)
                || (matriz[0][2] == winner && matriz[1][1] == winner && matriz[2][0] == winner)) {
            JOptionPane.showMessageDialog(null, "*Redoble de tambores* " + winner + " es el ganador!");
            win=true;
        }
        return win;
    }
}
