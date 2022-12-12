/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articulos;

/**
 *
 * @author chris
 */
public class Celular extends Articulo {
    public Celular(int cantidad, double precio) {
        super(cantidad, precio);
    }
    
    @Override
    public void operacion() {
        System.out.println("Celular haciendo algo");
    }
    
}
