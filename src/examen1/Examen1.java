/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Lain
 */
public class Examen1 {
public static ListaDoble ld=new ListaDoble();

public static ArbolBinario ab=new ArbolBinario();

public static ListaDoble ldfinal=new ListaDoble(){
    
};


   static void pushLD (NodoArbol nodo){
       ld.push(new NodoDoble("Fulano",nodo.valor));
   }

    static void inordenInsertar( NodoArbol nodo)
    {
        if(nodo == null)
            return;
         
        inordenInsertar(nodo.der);
       
           pushLD(nodo);
           
        inordenInsertar(nodo.izq);
        
    }
    public static void main(String[] args) {        
        int numeroAleatorio;
     int valor;
        //creo la lista circular
        //ListaDoble ld=new ListaDoble();
        System.out.println("Contenido de la lista doble :");
        ld.listado();System.out.println("");
        
        //le doy los valores a la lista
        for (int i = 0; i < 400; i++) {
        numeroAleatorio = (int) (Math.random()*700+1);

            NodoDoble fulano = new NodoDoble("Fulano",numeroAleatorio);
         ld.push(fulano);
        }
        
        
//veo la lista
System.out.println("Contenido de la lista doble despues de generar valores");
 ld.listado();     System.out.println("");
     //al arbol le paso los nodos de la lista doble  
       
       for (int i = 0; i < 400; i++) {
         NodoDoble pangano=ld.pop();
         valor=pangano.valor;
         //ld.sig();
          NodoArbol   panganos=new NodoArbol("Fulano", valor);
           ab.insertarO(panganos);
        }
//nodos ordenanos 
       System.out.println("nodos en el arbol binario ( inorden ):  ");
        ab.inorden1(ab.raiz);
        System.out.println("");

//regresar los nodos del arbol
        System.out.println("");
        
        ListaDoble ldfinal=new ListaDoble();
     /*  for (int i = 0; i < 400; i++) {
           
           NodoArbol mangano =ab.popL();
           valor=mangano.valor;
           NodoDoble manganos = new NodoDoble ("Fulano", valor);
           ldfinal.push(manganos);
        }*/
     ld.listado();
     
     
        System.out.println("procedo a llevar a cabo el "
                + "insertando de nuevo en la lista con ayuda de inorden insertar:");
       inordenInsertar(ab.raiz);
        //veo la lista
        System.out.println("Lista Doble Final:");
       ld.listado();
    }

    
    
}
