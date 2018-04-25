/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.mensajeria;

import java.util.Date;
import logica.usuario.usuario.Usuario;

/**
 *
 * @author PC
 */
public class Mensaje implements iMensaje {
    private Usuario origen;
    private Usuario destino;
    private String asunto;
    private String mensaje;
    private Date fecha;
    
    public Mensaje(){
        this.fecha = new Date();
    }
    
    public Mensaje(Usuario origen,Usuario destino){
        this.origen = origen;
        this.destino = destino;
        this.fecha = new Date();
    }

    @Override
    public void redactar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mensaje verMensaje() {
        return this;
    }
}
