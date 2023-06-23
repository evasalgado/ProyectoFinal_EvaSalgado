/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_evasalgado;



/**
 *
 * @author evaja
 */
public class menu_orden {
    
    String objetoorden; 
    int precio; 

    public menu_orden(String objetoorden, int precio) {
        this.objetoorden = objetoorden;
        this.precio = precio;
    }

   

    public String getObjetoorden() {
        return objetoorden;
    }

    public void setObjetoorden(String objetoorden) {
        this.objetoorden = objetoorden;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
    @Override
    public String toString() {
        return  objetoorden + ": lps." + precio;
    }

    boolean equalsignorecase(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   
    
}
