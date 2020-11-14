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
public class ListaDoble {
    NodoDoble puntero,raiz;
    

    @Override
    public String toString() {
        return "ListaDoble{" +
                "puntero=" + puntero +
                "texto=" + puntero.texto +
                '}';
    }
    void listado(){
        if(raiz==null){
            System.out.println("lista vacia");
        }else{
        while(ant()){
        }
        System.out.print(puntero.valor);
        while(sig()){
            System.out.print(" "+puntero.valor);
        }
        System.out.println();
        }
    }
void impInicio(){
    System.out.println("el inicio es: "+raiz.valor);
}
    void push(NodoDoble temp){
        boolean set =false;
       while(set==false){
           if(raiz==null){
            raiz=temp;
            raiz.siguiente=null;
            raiz.anterior=null;
            puntero=raiz;
            set=true;
            }else if (puntero.siguiente == null) {
                puntero.siguiente = temp;
                puntero.siguiente.siguiente = null;
                puntero.siguiente.anterior = puntero;
                set=true;
            } else {
                puntero=puntero.siguiente;
            }
        
       }
    }
    NodoDoble pop(){
        NodoDoble temp=new NodoDoble();
        puntero=raiz;        
        if (raiz.siguiente==null) {
            puntero=raiz;
            raiz=null;
        }else{
       
        while(puntero.siguiente!=null){
            temp=puntero;
            puntero=puntero.siguiente;
        }
        temp.siguiente=null;}
        
        
        return puntero;
    }//
    
    boolean sig(){
        if(puntero.siguiente==null){
            //System.out.println("Estas al final");
            return false;
        }
        else{
            puntero=puntero.siguiente;
        }
        return true;
    }
    boolean ant(){
        if(puntero.anterior==null){
            //System.out.println("Estas al inicio");
            return false;
        }
        else{
            puntero=puntero.anterior;
        }
        return true;
    }
}