/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_evasalgado.cutscenes;

import javax.swing.JOptionPane;
import proyectofinal_evasalgado.ProyectoFinal_EvaSalgado;
import proyectofinal_evasalgado.cutscenes.sprites.sprite1;
import proyectofinal_evasalgado.cutscenes.sprites.sprite10;
import proyectofinal_evasalgado.cutscenes.sprites.sprite11;
import proyectofinal_evasalgado.cutscenes.sprites.sprite12;
import proyectofinal_evasalgado.cutscenes.sprites.sprite13;
import proyectofinal_evasalgado.cutscenes.sprites.sprite14;
import proyectofinal_evasalgado.cutscenes.sprites.sprite15;
import proyectofinal_evasalgado.cutscenes.sprites.sprite16;
import proyectofinal_evasalgado.cutscenes.sprites.sprite17;
import proyectofinal_evasalgado.cutscenes.sprites.sprite2;
import proyectofinal_evasalgado.cutscenes.sprites.sprite3;
import proyectofinal_evasalgado.cutscenes.sprites.sprite4;
import proyectofinal_evasalgado.cutscenes.sprites.sprite5;
import proyectofinal_evasalgado.cutscenes.sprites.sprite6;
import proyectofinal_evasalgado.cutscenes.sprites.sprite7;
import proyectofinal_evasalgado.cutscenes.sprites.sprite8;
import proyectofinal_evasalgado.cutscenes.sprites.sprite9;
import proyectofinal_evasalgado.visualcutscene.escenapedido.esperando;
import proyectofinal_evasalgado.visualcutscene.escenapedido.menu;
import proyectofinal_evasalgado.visualcutscene.escenapedido.scene1;

/**
 *
 * @author evaja
 */
public class cutscenedialog {
    scene1 llegada = new scene1();
    menu menu = new menu();
    esperando wait = new esperando();
    proyectofinal_evasalgado.ProyectoFinal_EvaSalgado ordenar = new ProyectoFinal_EvaSalgado();
    goodend ending1 = new goodend();
    badend ending2 = new badend();
    //cutscenes and sprites
    
    proyectofinal_evasalgado.cutscenes.sprites.sprite1 sprite1 = new sprite1();
    proyectofinal_evasalgado.cutscenes.sprites.sprite2 sprite2 = new sprite2();
    proyectofinal_evasalgado.cutscenes.sprites.sprite3 sprite3 = new sprite3();
    proyectofinal_evasalgado.cutscenes.sprites.sprite4 sprite4 = new sprite4();
    proyectofinal_evasalgado.cutscenes.sprites.sprite5 sprite5 = new sprite5();
    proyectofinal_evasalgado.cutscenes.sprites.sprite6 sprite6 = new sprite6();
    proyectofinal_evasalgado.cutscenes.sprites.sprite7 sprite7 = new sprite7();
    proyectofinal_evasalgado.cutscenes.sprites.sprite8 sprite8 = new sprite8();
    proyectofinal_evasalgado.cutscenes.sprites.sprite9 sprite9 = new sprite9();
    proyectofinal_evasalgado.cutscenes.sprites.sprite10 sprite10 = new sprite10();
    proyectofinal_evasalgado.cutscenes.sprites.sprite11 sprite11 = new sprite11();
    proyectofinal_evasalgado.cutscenes.sprites.sprite12 sprite12 = new sprite12();
    proyectofinal_evasalgado.cutscenes.sprites.sprite13 sprite13 = new sprite13();
    proyectofinal_evasalgado.cutscenes.sprites.sprite14 sprite14 = new sprite14();
    proyectofinal_evasalgado.cutscenes.sprites.sprite15 sprite15 = new sprite15();
    proyectofinal_evasalgado.cutscenes.sprites.sprite16 sprite16 = new sprite16();
    proyectofinal_evasalgado.cutscenes.sprites.sprite17 sprite17 = new sprite17();
    
    
    public  void startdialog(){
        JOptionPane.showMessageDialog(null, "*Te levantaste temprano hoy, debes ir a tu trabajo.*");
        JOptionPane.showMessageDialog(null, "*No obstante, el sueño te anda encima, asi que decides ir a un café que acaba de abrir.*");
        JOptionPane.showMessageDialog(null, "'Hm....hay un nuevo café cerca de mi casa, creo que se llama EL MINIMALISTA...'");
        JOptionPane.showMessageDialog(null, "'Me pregunto porque se llamará así. Bueno, mejor voy por ese café, me siento cansad@...'");
    } 
    public  void arrivaldialog(){
        llegada.setVisible(true);
        JOptionPane.showMessageDialog(null, "*Llegas al lugar y te quedas algo atonit@ por la estética de este.*");
        JOptionPane.showMessageDialog(null, "Tu: Vaya, ya veo porque el nombre...");
        JOptionPane.showMessageDialog(null, "*Antes de que siguieras con tus pensamientos, alguien se pone enfrente de tí...*");
        sprite1.setVisible(true);
        JOptionPane.showMessageDialog(null, "???: BIENVENIDO!");
        llegada.dispose();
        JOptionPane.showMessageDialog(null, "Tu: Ah! Me asustaste!");
        sprite1.dispose();
        sprite2.setVisible(true);
        JOptionPane.showMessageDialog(null, "???: Perdoname...eres nuestro primer cliente hasta ahora.");
        sprite2.dispose();
        sprite3.setVisible(true);
        JOptionPane.showMessageDialog(null, "???: Dejame presentarme primero. Llamame....Aki.");
        sprite3.dispose();
        sprite4.setVisible(true);
        JOptionPane.showMessageDialog(null, "??:DEVON! A TRABAJAR!");
        sprite4.dispose();
        sprite5.setVisible(true);
        JOptionPane.showMessageDialog(null, "Aki: UGH!! LO SÉ, EN ESO ESTOY!!");
        sprite5.dispose();
        sprite6.setVisible(true);
        JOptionPane.showMessageDialog(null, "Aki: Disculpame por eso, por favor no uses Devon");
        sprite6.dispose();
        sprite7.setVisible(true);
        JOptionPane.showMessageDialog(null, "Aki: Ahora, en que estaba....A sí! Tomar tu Orden");
        sprite7.dispose();
        menu.setVisible(true);
        JOptionPane.showMessageDialog(null, "Aki: Mira, este es tu menú. Tu solo dime lo que quieres.");
        ordenar.ordenar();
        ordenar.ordenfinal();
        menu.dispose();
    } 
    public void game(){
        wait.setVisible(true);
        JOptionPane.showMessageDialog(null, "Wow! el juego es X-O");
        JOptionPane.showMessageDialog(null, "Jugarás en contra de la computadora. Buena Suerte!");
        ordenar.TicTacToe();
        
        
    } 
    public void finalorderdialog(){
        wait.dispose();
        sprite10.setVisible(true);
        JOptionPane.showMessageDialog(null, "Aki: Listo, aquí esta tu orden!");
        sprite10.dispose();
        sprite11.setVisible(true);
        JOptionPane.showMessageDialog(null, "Aki: Espero la disfrutes, se hizo con mucho amor!");
        JOptionPane.showMessageDialog(null, "Aki: Bueno, es hora de pagar!");
        int destino = Integer.parseInt(JOptionPane.showInputDialog("1. Pagar su orden\n2. No pagar nada\n\nelige tu destino: "));
        
        destino(destino);
    }
    public  void destino(int destino){
        if (destino == 1){
            JOptionPane.showMessageDialog(null, "Tu: Muchas gracias, estuvo muy bueno!");
            sprite11.dispose();
            sprite12.setVisible(true);
            JOptionPane.showMessageDialog(null, "Aki: Listo! Muchas Gracias! Espero volver a verte pronto!");
            sprite12.dispose();
            JOptionPane.showMessageDialog(null, "*Sales del cafe, directo a tu trabajo, pensando en lo que acaba de pasar...*");
            
            ending1.setVisible(true);
            System.out.println("Final Neutro: Pagaste y te gusto\n");
            System.out.println("Lo que ordenaste te desperto, dejandote \nlisto para ir al trabajo. No\ncabe duda que estaba \ndelicioso.");
        } else if (destino == 2) {
            JOptionPane.showMessageDialog(null, "Tu: El tema es...olvide mi billetera.");
            sprite11.dispose();
            sprite13.setVisible(true);
            JOptionPane.showMessageDialog(null, "Aki:....");
            sprite13.dispose();
            sprite14.setVisible(true);
            JOptionPane.showMessageDialog(null, "Aki:...Perdona?");
            JOptionPane.showMessageDialog(null, "Tu:...Yo...deje mi billetera.");
            sprite14.dispose();
            sprite15.setVisible(true);
            JOptionPane.showMessageDialog(null, "Aki:...");
            JOptionPane.showMessageDialog(null, "Tu:...");
            sprite16.setVisible(true);
            JOptionPane.showMessageDialog(null, "Aki:...A lavar tazas.");
            sprite16.dispose();
            sprite15.setVisible(true);
            JOptionPane.showMessageDialog(null, "Tu:...Que?");
            sprite15.dispose();
            sprite17.setVisible(true);
            JOptionPane.showMessageDialog(null, "Aki: Sin que ni pero, a lavar tazas!");
            sprite17.dispose();
            ending2.setVisible(true);
            System.out.println("Final malo: Lavatrastes\n");
            System.out.println("Como se te olvido la billetera, \nno tienes con que pagar. Aki sin \ndudar ni un momento te pone\na lavar platos. La proxima vez procura\nno olvidar tu billetera.");

        }
    }
} 

