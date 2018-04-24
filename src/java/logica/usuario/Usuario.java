/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario;

/**
 *
 * @author PC
 */
public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String docIdentidad;
    protected String correo;
    
    public abstract void verMensaje();
    public abstract boolean iniciarSesion();
    
 
    
    
}
