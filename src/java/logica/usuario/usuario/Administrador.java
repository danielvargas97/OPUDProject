/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.usuario;

import logica.usuario.mensajeria.BandejaEntrada;

/**
 *
 * @author PC
 */
public class Administrador extends Usuario {

    public Administrador(BandejaEntrada bandeja) {
        super(bandeja);
    }
    
    @Override
    public void verMensaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean iniciarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
