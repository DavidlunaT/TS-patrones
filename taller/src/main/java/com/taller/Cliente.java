package com.taller;

import chainOfResponsability.AsistenteHandler;
import chainOfResponsability.GerenteHandler;
import chainOfResponsability.Handler;
import chainOfResponsability.JefeInventarioHandler;
import chainOfResponsability.TecnicoHandler;

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
