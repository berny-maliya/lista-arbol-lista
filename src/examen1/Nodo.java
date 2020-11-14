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
public class Nodo {
    Nodo apuntador;
String texto;
    int valor;
Object transporte;
Nodo(){
    }
    Nodo(String t,int n){
        texto=t;
valor=n;
}
    @Override
public String toString() {
        return "Nodo{" +
                "apuntador=" + apuntador +
                ", texto='" + texto + '\'' +
                ", valor=" + valor +
                ", Objeto=" + transporte +
                '}';
}
}  
