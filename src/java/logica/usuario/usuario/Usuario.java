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
public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String docIdentidad;
    protected String correo;
    protected BandejaEntrada bandeja;
    protected Contrasena contrasena;
    
    public abstract void verMensaje(int index);
    public abstract boolean iniciarSesion();
    public abstract void redactarMensaje(Usuario destino,String asunto,String mensaje);

    public Usuario(BandejaEntrada bandeja){
        this.bandeja = bandeja;
    }
    
    public void asignarContrasena(String nuevaContrasena){
        try{
            contrasena.setContrasena(nuevaContrasena);
        }
        catch(NullPointerException e){
            e.printStackTrace();
            contrasena = new Contrasena(nuevaContrasena);
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public BandejaEntrada getBandeja() {
        return bandeja;
    }

    public void setBandeja(BandejaEntrada bandeja) {
        this.bandeja = bandeja;
    }

    public Contrasena getContrasena() {
        return contrasena;
    }

    public void setContrasena(Contrasena contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
