/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto.objetos;

import java.util.Random;

/**
 *
 * @author PC
 */
public abstract class Objeto {
    protected String idObjeto;
    protected String nombre;
    protected Categoria categoría;
    protected String descripcion;
    protected String estado;
    
    public Objeto(String nombre, String descripcion,String estado){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;        
    }

    public void asignarCategoria(int indice){
        SelectorCategoria selector = new SelectorCategoria();
        this.categoría = selector.verCategoria(indice);
    
    }
    
    private void generarID(){
        Random r = new Random(System.currentTimeMillis());
        Long id =r.nextLong();        
        this.idObjeto = Long.toString(id,10);
    }
}
