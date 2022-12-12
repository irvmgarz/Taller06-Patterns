/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.taller06.patterns;

import Actores.Actor;

/**
 *
 * @author chris
 */
public class FachadaBase implements IFachada {

    @Override
    public void mostrarInventario(Actor a) {
       String tipo = a.getClass().getName();
       if(tipo.equals("AsistenteMantenimiento")){
            //mostrar inventario del asistente de mantenimiento
       }
       if(tipo.equals("CompradorWeb")){
            //mostrar inventario del comprador web
       }
       if(tipo.equals("Proveedor")){
            //mostrar inventario del proveedor
       }
       if(tipo.equals("VendedorTienda")){
            //mostrar inventario del vendedor de tienda
       }
    }
    
}
