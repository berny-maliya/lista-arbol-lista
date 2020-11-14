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
public class ArbolBinario {
    NodoArbol raiz;
    NodoArbol puntero;
    ArbolBinario(){
    }
    
    void impPre(){
        preorden(raiz);
        System.out.println();
    }
    void preorden(NodoArbol x){
        if(x!=null){
            System.out.print(x.valor+"-");
            preorden(x.izq);
            preorden(x.der);
        }
    }
    void impPos(){
        posorden(raiz);
        System.out.println();
    }
    void posorden(NodoArbol x){
        if(x!=null){
          posorden(x.der);  
          posorden(x.izq);
            
            System.out.print(x.valor+"-");
        }
    }
    void pushD(NodoArbol t){
        if(raiz==null){
            raiz=t;
            raiz.izq=null;
            raiz.der=null;
            puntero=raiz;
        }
        else{
            if(puntero.der==null){
                puntero.der=t;
            }
            else{
                System.out.println("Ya esta ocupado");
            }
        }
    }
    void pushI(NodoArbol t){
        if(raiz==null){
            raiz=t;
            raiz.izq=null;
            raiz.der=null;
            puntero=raiz;
        }
        else{
            if(puntero.izq==null){
                puntero.izq=t;
            }
            else{
                System.out.println("Ya esta ocupado");
            }
        }
    }
    void veRaiz(){
        puntero=raiz;
    }
    void izq(){
        if(puntero.izq!=null) {
            puntero = puntero.izq;
        }
        else{
            System.out.println("No hay izquierda");
        }
    }
    void der(){
        if(puntero.der!=null) {
            puntero = puntero.der;
        }
        else{
            System.out.println("No hay derecha");
        }
    }
    @Override
    public String toString() {
        return "ArbolBinario{" +
                "raiz=" + raiz +
                ", puntero=" + puntero +
                '}';
    }
    
   
    
    
void nivel(int n){
    //nivel 0
    System.out.println("Nivel 0");
    if(raiz!=null) {
        System.out.println(raiz.texto);
    }
    else {
        System.out.println("***");
    }
    //nivel 1
    System.out.println("Nivel 1");
    if(raiz.izq!=null) {
        System.out.print(raiz.izq.texto);
    }
    else {
        System.out.print("***");
    }
    System.out.print("\t\t");
    if(raiz.der!=null) {
        System.out.println(raiz.der.texto);
    }
    else {
        System.out.println("***");
    }
    // nivel 2
    System.out.println("Nivel 2");
    if(raiz.izq.izq!=null) {
        System.out.print(raiz.izq.izq.texto);
    }
    else {
        System.out.print("***");
    }
    System.out.print("\t\t");
    if(raiz.izq.der!=null) {
        System.out.print(raiz.izq.der.texto);
    }
    else {
        System.out.print("***");
    }
    System.out.print("\t\t");
    if(raiz.der.izq!=null){
        System.out.print(raiz.der.izq.texto);
    }
    else {
        System.out.print("***");
    }
    System.out.print("\t\t");
    if(raiz.der.der!=null) {
        System.out.println(raiz.der.der.texto);
    }
    else {
        System.out.println("***");
    }

}
void impnivel(int deseado){
    nivelorden(raiz,0,deseado);
    System.out.println();
}
void nivelorden(NodoArbol x,int nivel, int deseado){
    if(x!=null || nivel==deseado){
        if(nivel==deseado) System.out.print(x.texto+"-");
        nivelorden(x.izq,nivel++,deseado);
        nivelorden(x.der,nivel++,deseado);
    }
}
//examen URQUIJO MUNGARRO   
void BuscarO (int t){
    System.out.println("*************************************");
    System.out.println("estas buscando el nombre del que tenga el numero " + t+ " en el arbol"
            + "binario");
    boolean found=false;
    puntero=raiz;
    while (found==false){
    
        if(raiz==null){
            System.out.println("No hay ningun nodo en la raiz ");
            
            found=true;
            break;
            
        }
        if(t==puntero.valor){
            System.out.println(t + " lo tiene "+ puntero.texto);
            puntero=raiz;
            found =true;
            
        }
    if (t <= puntero.valor){
        puntero=puntero.izq;
        
    }else{
       puntero=puntero.der;
    }
    
    }
}
void imprimirO(NodoArbol t){
    
    if (t.der!= null) {
          
          imprimirO(t.der);
        }else if (t.izq!=null){
          
          imprimirO(t.izq);
        }else{System.out.println("El nodo que esta mas abajo en el arbol de "
                + "la derecha es: "+t.valor); 
        }
}
//inorden es el mistero de como regresarlos en orden
      void inorden1( NodoArbol nodo)
    {
        if(nodo == null)
            return;
        inorden1(nodo.der);
        System.out.print(nodo.valor + " ");
        inorden1(nodo.izq);
    }
      void inordenInsertar( NodoArbol nodo)
    {
        if(nodo == null)
            return;
        inordenInsertar(nodo.der);
        System.out.print(nodo.valor + " ");
        
        inordenInsertar(nodo.izq);
    }
//popea el ultimo elemento que este mas profundo en la lista
NodoArbol popL (){
          boolean ultimo=false;
          NodoArbol temp=new NodoArbol();
          puntero=raiz;
        while(ultimo==false){
        
            if (puntero.der!= null) {
            //guardo la pocicion de puntero y luego lo muevo asi conservo la anterior
                temp=puntero;
            puntero=puntero.der;
            
        }else if (puntero.izq!=null){
            temp=puntero;
            puntero=puntero.izq;
            
        }else{
           /* System.out.println("El nodo que esta mas abajo en el arbol de "
                + "la derecha es: "+puntero.valor);  
            Ya que llego al puntero de hasta abajo checo si el este nodo esta a la izquierda o derecha de su "padre" */
                if (temp.izq==puntero) {
                  //  System.out.println("el utltimo nodo esta a la izquierda de su padre ");   
                    temp.izq=null;
                }else  if (temp.der==puntero){ //System.out.println("el ultimo nodo esta a la derecha de su padre");
                temp.der=null;}
        ultimo=true;
               }
        
        
        }
   return puntero;
}
    
    
    
    NodoArbol popall (NodoArbol x){
        if(x!=null){
          popall(x.der);  
         popall(x.izq);
          System.out.println("Valor: " +x.valor+ " texto: "+x.texto+"-");
        return x;  
        }
return null;
}
void insertarO (NodoArbol t){
    boolean set=false;
    puntero=raiz;
    while (set==false){
    
        if(raiz==null){
           /* System.out.println("el arbol esta vacio "+t.valor+ " es la raiz ahora");
            System.out.println("");*/
            raiz=t;
            raiz.izq=null;
            raiz.der=null;
            
            puntero=raiz;
            set=true;
            break;
            
        }
    if (t.valor < puntero.valor){
        //puntero.izq.valor;
        if (puntero.izq==null) { 
           /* System.out.println("el nodo  "+t.valor+" va a la izquierda de " + puntero.valor);
            System.out.println("");*/
            puntero.izq=t;
          
            
            set=true;
            break;
        }else{
           // System.out.println("La izquierda de "+ puntero.valor +" esta ocupada por "+puntero.izq.valor );
            puntero=puntero.izq; 
        }
    }else{
        if (puntero.der==null){
         //   System.out.println("el nodo  "+t.valor+" va a la derecha de " + puntero.valor);
         //   System.out.println("");
            puntero.der=t;
           
            set=true;
            break;
        }else{
       //     System.out.println("La derecha de "+ puntero.valor + " esta ocupada por "+ puntero.der.valor);
            puntero=puntero.der;
        }
    }
    
    }
}

    void push(NodoDoble nodoDoble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
