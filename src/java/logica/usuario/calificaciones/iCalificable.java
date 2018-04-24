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
public interface iCalificable {
    public boolean calificar(UsuarioOPUD usuario, int nota);
    public int verCalificacion();
    public void asignarNota(int nota);
}
