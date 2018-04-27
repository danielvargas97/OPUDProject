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
    
    public void reportarUsuarioOPUD(UsuarioOPUD usuario){
        //Mensaje m = new Mensaje();
        
    }
    
    @Override
    public void verMensaje(int index) {
        BandejaEntrada buzon = super.getBandeja();
        buzon.verMensaje(index);
    }

    @Override
    public boolean iniciarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redactarMensaje(Usuario destino, String asunto, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
