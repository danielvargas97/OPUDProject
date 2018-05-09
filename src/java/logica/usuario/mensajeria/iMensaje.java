/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.mensajeria;

import java.util.List;

/**
 *
 * @author PC
 */
public interface iMensaje {
    public void redactar(String origen, String destino,String asunto, String mensaje);
    public List<String> verMensaje(int index);
    public void asignarOrigen(String idUser);
    
}
