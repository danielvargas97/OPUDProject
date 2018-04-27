/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.usuario;


import logica.usuario.calificaciones.iCalificable;
import logica.usuario.mensajeria.BandejaEntrada;

/**
 *
 * @author PC
 */
public class UsuarioOPUD extends Usuario {
    private String rolUniversidad;
    private String codigo;
    private iCalificable calificacion;
    
    public UsuarioOPUD(BandejaEntrada bandeja,iCalificable calificacion){
        super(bandeja);
        this.calificacion = calificacion;
    }
    
    public void calificar(UsuarioOPUD usuario, int nota){
        calificacion.calificar(usuario, nota);
    }
    
    public int verMiNota(){
        return calificacion.verCalificacion();
    }
    
    @Override
    public void verMensaje(int index) {
        BandejaEntrada miBandeja = super.getBandeja();
        miBandeja.verMensaje(index);
        
    }

    @Override
    public boolean iniciarSesion() {
        return false;
    }

    @Override
    public void redactarMensaje(Usuario destino, String asunto, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public String getRolUniversidad() {
        return rolUniversidad;
    }

    public void setRolUniversidad(String rolUniversidad) {
        this.rolUniversidad = rolUniversidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public iCalificable getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(iCalificable calificacion) {
        this.calificacion = calificacion;
    }
    
}
