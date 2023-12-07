/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.taller;

import ChainOfResponsability.AsistenteHandler;
import ChainOfResponsability.GerenteHandler;
import ChainOfResponsability.Handler;
import ChainOfResponsability.JefeInventarioHandler;
import ChainOfResponsability.TecnicoHandler;

/**
 *
 * @author johan
 */
public class Cliente implements Handler {
    private Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void peticion(Producto p) {
        AsistenteHandler ah = new AsistenteHandler();
        setNext(ah);
        
        TecnicoHandler th = new TecnicoHandler();
        setNext(th);
        
        JefeInventarioHandler jh = new JefeInventarioHandler();
        setNext(jh);
        
        GerenteHandler gh = new GerenteHandler();
        setNext(gh);
    }
    
}
