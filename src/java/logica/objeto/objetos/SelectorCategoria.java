/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.objeto.objetos;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class SelectorCategoria {
    private ArrayList<Categoria> categorias;
    
    public SelectorCategoria(){
        categorias = new ArrayList<Categoria>();
        cargarCategorias();
    }
    
    private void cargarCategorias(){
    
    }
    
    public void agregarCategoria(Categoria cat){
        categorias.add(cat);
    }
    
    public void quitarCategoria(Categoria cat){
        categorias.remove(cat);
    }
    
    public Categoria verCategoria(int indice){
        return categorias.get(indice);
    }
    
    
}
