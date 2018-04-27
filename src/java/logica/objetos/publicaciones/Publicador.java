/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.objetos.publicaciones;

import java.util.Date;

/**
 *
 * @author PC
 */
public abstract class Publicador implements iPublicable {
    protected Date fechaPublicacion;
    protected int tipoPubilicacion;
    
    Publicador(){}

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getTipoPubilicacion() {
        return tipoPubilicacion;
    }

    public void setTipoPubilicacion(int tipoPubilicacion) {
        this.tipoPubilicacion = tipoPubilicacion;
    }
    
    
    
}
