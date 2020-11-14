package examen1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lain
 */
public class NodoDoble extends Nodo {
    NodoDoble anterior,siguiente;
   
    
    NodoDoble(String tex,int val){
        this.texto=tex;
        this.valor=val;
        }

    NodoDoble() {
        
    }
}
