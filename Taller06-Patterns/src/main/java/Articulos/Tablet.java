/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articulos;

/**
 *
 * @author chris
 */
public class Tablet extends Articulo {
    public Tablet(int cantidad, double precio) {
        super(cantidad, precio);
    }

    @Override
    public void operacion() {
        System.out.println("Tablet haciendo algo");
    }
    
}
