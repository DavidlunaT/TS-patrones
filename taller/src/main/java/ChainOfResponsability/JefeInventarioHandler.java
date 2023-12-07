/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

import com.taller.Producto;

/**
 *
 * @author johan
 */
public class JefeInventarioHandler extends BaseHandler {

    private Handler next;

    @Override
    public void peticion(Producto p) {
        if (p.existeEnBodega()) {

            next.peticion(p);

        } else {
            System.out.println("No existe su producto en bodega para reposición");
        }
    }

}
