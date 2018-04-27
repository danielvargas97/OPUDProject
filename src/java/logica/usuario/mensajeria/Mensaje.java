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
    private boolean leido;
    private Date fecha;
    
    public Mensaje(){
        this.fecha = new Date();
        this.leido = false;
    }
    
    public Mensaje(Usuario origen,Usuario destino){
        this.origen = origen;
        this.destino = destino;
        this.fecha = new Date();
        this.leido = false;
    }

    @Override
    public void redactar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mensaje verMensaje() {
        return this;
    }

    public Usuario getOrigen() {
        return origen;
    }

    public void setOrigen(Usuario origen) {
        this.origen = origen;
    }

    public Usuario getDestino() {
        return destino;
    }

    public void setDestino(Usuario destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
    
}
