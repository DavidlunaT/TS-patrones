/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainOfResponsability;

import com.taller.Producto;

/**
 *
 * @author johan
 */
public class AsistenteHandler extends BaseHandler {
    
    private Handler next;
    
    @Override
    public void peticion(Producto p){
        if(p.GarantiaValida()){
            next.peticion(p);
        } else{
            System.out.println("Su producto no está en garantía");
        }
    }
    
}
