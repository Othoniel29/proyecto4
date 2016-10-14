
package listaE;

import nodo.Nodo;

/**
 *
 * @author OTHONIEL
 */
public class ListaEnlazada {
  protected Nodo inicio, fin;//punteros para saber donde esta el inicio y el fin
public ListaEnlazada (){
    inicio= null;
    fin= null; 
} 
// metodo para saber si la lista esta basia
public boolean estaVacia(){
    if (inicio==null){
        return true;
    }else{
        return false;
    }
}
//metodo para insertar al final de la lista
public void agregaralFinal(int elemento){
if (!estaVacia()){
    fin.siguiente=new Nodo (elemento);
    fin=fin.siguiente;
}else{
inicio=fin =new Nodo(elemento);    
}
}
//metodo ára agregar nodo al inicio de la lista
public void agregarAlInicio (int elemento){
    //creando al nodo
    inicio= new Nodo( elemento, inicio);
    if(fin==null){
        fin=inicio;
    }
}
    //metodo para mostrarlos datos

   
    public void mostrarLista (){
        Nodo recorrer= inicio;
        System.out.println();
        while( recorrer!=null){
        System.out.print(" ["+recorrer.dato+"]--->");
        recorrer=recorrer.siguiente;
        
    } 
    }
    //metodo para eliminar un nodo del inicio
    public int BorrarDelInicio(){
    int elemento = inicio.dato;
    if (inicio==fin){
    inicio=null;
            fin=null;
            
    }else{
        inicio=inicio.siguiente;  
    }
    return elemento;
    }
    //metodo para eliminar un nodo del final
    public int BorrarDelFinal(){
    int elemento = fin.dato;
    if (inicio==fin){
    inicio=null;
            fin=null;
    }else{
        Nodo temporal = inicio;
        while(temporal.siguiente!=fin){
            temporal=temporal.siguiente;            
       }
        fin=temporal;
        fin.siguiente=null;
               
    }
    return elemento;
    }
    //metodo para eliminar un nodo en especifico
    public void EliminarCualquierNodo(int elemento){
    if(!estaVacia()){
        if(inicio==fin && elemento==inicio.dato){
        inicio=fin=null;
        }else if(elemento==inicio.dato){
        inicio=inicio.siguiente;
        }else{
            Nodo anterior,temporal;
            anterior=inicio;
            temporal=inicio.siguiente;
            while (temporal!=null && temporal.dato!=elemento){
            anterior = anterior.siguiente;
            temporal=temporal.siguiente;
            if(temporal!=null){
                temporal.siguiente=temporal.siguiente;
                if (temporal ==fin){
                    fin=anterior;
                }
            }
          }
        }
    }
    
  }
 }