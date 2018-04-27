/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.usuarios;

import java.util.Random;
import logica.usuario.calificaciones.Calificador;
import logica.usuario.calificaciones.iCalificable;
import logica.usuario.mensajeria.BandejaEntrada;
import logica.usuario.mensajeria.Mensaje;
import logica.usuario.usuario.UsuarioOPUD;

/**
 *
 * @author PC
 */
public class TestUser {
    public static void main(String args[]){
        Random r = new Random(System.currentTimeMillis());
        iCalificable calificacion_x = new Calificador();
        iCalificable calificacion_y = new Calificador();
        BandejaEntrada bandeja_x = new BandejaEntrada();
        BandejaEntrada bandeja_y = new BandejaEntrada();
        
        
        UsuarioOPUD user_one = new UsuarioOPUD(bandeja_x, calificacion_x);
        UsuarioOPUD user_two = new UsuarioOPUD(bandeja_y, calificacion_x);
        
        int x = 0;
        int y = 0;
        System.out.println("Probando Calificaciones");
        for(int i=0;i<200;i++){
            x = r.nextInt(51);
            y = x+y;
            System.out.print(x+" ");
            user_one.calificar(user_two, x);
        }
        System.out.println();
        System.out.println(y);
        System.out.println(user_two.verMiNota());
        
        System.out.println("Probando Correo");
        Mensaje nuevo = new Mensaje(user_one,user_two);
        nuevo.setAsunto("Probando el Correo");
        nuevo.setMensaje("Ipsum Lorem");
        bandeja_x.crearMensaje(nuevo);
        
        Mensaje n = bandeja_x.verMensaje(0);
        System.out.println(n.getAsunto());
        System.out.println(n.getMensaje());
        
        
    }
}
