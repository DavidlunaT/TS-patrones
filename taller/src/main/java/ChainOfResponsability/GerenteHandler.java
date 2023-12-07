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
public class GerenteHandler extends BaseHandler {

    private Handler next;

    @Override
    public void peticion(Producto p) {

        if (p.getPrecio() > 1000) {

            System.out.println("Su producto requiere aprobación del Gerente");
        } else {
            System.out.println("Su producto será atendido");
        }
    }

}
