/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.calificaciones;

import logica.usuario.usuario.UsuarioOPUD;


/**
 *
 * @author PC
 */
public class Calificador implements iCalificable {
    private String idUsuario;
    private int nota;
    private int numeroCalificaciones;
    
    public Calificador(String idUsuario){
        this.idUsuario = idUsuario;
        this.nota = 0;
        this.numeroCalificaciones = 0;
    }
    
    public Calificador(String idUsuario,int nota,int numCalificacion){
        this.idUsuario = idUsuario;
        this.nota = nota;
        this.numeroCalificaciones = numCalificacion;
    }
    

    @Override
    public boolean calificar(UsuarioOPUD usuario, int nota) {
        if (revisarNota(nota)){
            iCalificable notasUsuario = usuario.getCalificacion();
            notasUsuario.asignarNota(nota);
            return true;
        }
        return false;
    }
    
    @Override
    public int verCalificacion() {
        return nota;
    }
    
    @Override
    public void asignarNota(int nota){
        numeroCalificaciones++;
        this.nota = nota/numeroCalificaciones;
    }
    
    
    private boolean revisarNota(int nota){
        return (nota<0 || nota>50);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNumeroCalificaciones() {
        return numeroCalificaciones;
    }

    public void setNumeroCalificaciones(int numeroCalificaciones) {
        this.numeroCalificaciones = numeroCalificaciones;
    }


    
    
}
