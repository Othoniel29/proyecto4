
package nodo;

/**
 *
 * @author OTHONIEL
 */
public class Nodo {
    public int dato; 
    public Nodo siguiente;// puntero enlace
    
    //consructor para insertar al final
    public Nodo (int d){
        this.dato=d;  
    }
    //consructor para insertar al inicio
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente = n;
        
        
    }
}
