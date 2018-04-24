/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.mensajeria;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BandejaEntrada {
    private String idBandeja;
    private ArrayList<Mensaje> buzon;
    
    public BandejaEntrada(){
    
    }
    
    public Mensaje verMensaje(){
        return null;
    }
    
    public void crearMensaje(Mensaje nuevo){
        buzon.add(nuevo);
    }
    
    public void eliminarMensaje(Mensaje aBorrar){
        buzon.remove(aBorrar);
    }
}

