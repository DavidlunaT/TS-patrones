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
public interface Handler {
    
    public void setNext(Handler h);
    public void peticion(Producto p);
    
}
