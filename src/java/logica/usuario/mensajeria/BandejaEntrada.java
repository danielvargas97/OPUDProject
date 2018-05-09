/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario.mensajeria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author PC
 */
public class BandejaEntrada implements iMensaje {
    private String idBandeja;
    private ArrayList<Mensaje> buzonEntrada;
    private ArrayList<Mensaje> buzonSalida;
    
    
    public BandejaEntrada(){
        this.buzonEntrada = new ArrayList<>(); 
    }
    
    @Override
    public void redactar(String origen, String destino, String asunto, String mensaje) {
        Mensaje m = new Mensaje(origen,destino);
        m.setAsunto(asunto);
        m.setMensaje(mensaje);        
        
    }

    @Override
    public List<String> verMensaje(int index) {
        Mensaje mensajePedido = buzonEntrada.get(index);
    	List<String> mensaje = new ArrayList<String>();
        
    	mensaje.add(mensajePedido.getOrigen());
    	mensaje.add(mensajePedido.getDestino());
    	mensaje.add(mensajePedido.getAsunto());
    	mensaje.add(mensajePedido.getMensaje());
    	
    	
    	return mensaje;
    }
    
     @Override
    public void asignarOrigen(String idUser) {
        this.idBandeja = idUser;
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

