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
    public static final int NOTA_MINIMA = 0;
    public static final int NOTA_MAXIMA = 50;
    private String idUsuario;
    private int notaAcumulada;
    private int numeroCalificaciones;
    
    public Calificador(){
        this.notaAcumulada = 0;
        this.numeroCalificaciones = 0;
    }
    
    public Calificador(String idUsuario){
        this.idUsuario = idUsuario;
        this.notaAcumulada = 0;
        this.numeroCalificaciones = 0;
    }
    
    
    public Calificador(String idUsuario,int nota,int numCalificacion){
        this.idUsuario = idUsuario;
        this.notaAcumulada = nota;
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
        try{
            return notaAcumulada/numeroCalificaciones;
        }
        catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
    
    @Override
    public void asignarNota(int nota){
        numeroCalificaciones++;
        this.notaAcumulada = this.notaAcumulada+nota;
    }
    
    
    private boolean revisarNota(int nota){
        return (nota>=NOTA_MINIMA && nota<=NOTA_MAXIMA);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNotaAcumulada() {
        return notaAcumulada;
    }

    public void setNotaAcumulada(int nota) {
        this.notaAcumulada = nota;
    }

    public int getNumeroCalificaciones() {
        return numeroCalificaciones;
    }

    public void setNumeroCalificaciones(int numeroCalificaciones) {
        this.numeroCalificaciones = numeroCalificaciones;
    }


    
    
}
