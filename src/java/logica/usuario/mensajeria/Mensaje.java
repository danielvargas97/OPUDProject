/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.mensajeria;

/**
 *
 * @author PC
 */
public class Mensaje implements iMensaje {
    private String asunto;
    private String mensaje;
    
    public Mensaje(){
        
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
