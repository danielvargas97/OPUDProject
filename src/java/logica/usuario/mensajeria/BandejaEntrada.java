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
    private ArrayList<Mensaje> buzonEntrada;
    private ArrayList<Mensaje> buzonSalida;
    
    
    public BandejaEntrada(){
        this.buzonEntrada = new ArrayList<>(); 
    }
    
    public Mensaje verMensaje(int index){
        return buzonEntrada.get(index);
    }
    
    public void crearMensaje(Mensaje nuevo){
        buzonSalida.add(0, nuevo);
    }
    
    public void eliminarMensaje(Mensaje aBorrar){
        buzonEntrada.remove(aBorrar);
    }

    public String getIdBandeja() {
        return idBandeja;
    }

    public ArrayList<Mensaje> getBuzonEntrada() {
        return buzonEntrada;
    }

    public ArrayList<Mensaje> getBuzonSalida() {
        return buzonSalida;
    }
    
    
}

