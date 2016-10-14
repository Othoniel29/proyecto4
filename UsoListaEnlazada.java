
package ListaEnlazada;

import listaE.ListaEnlazada;
import javax.swing.JOptionPane;


public class UsoListaEnlazada {

    
    public static void main (String[] args){
        ListaEnlazada listita=new ListaEnlazada();
        int opcion =0, el;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. agregar un elemento al inicio de la lista\n2.agregar un elemento al final de la lista\n"
                                + "3.Mostrar los datos de la lista\n"+"4.eliminar un elemento del inicio de la lista\n"
                                +"5.eliinar un elemento del final de la lista\n"
                 
                                +"6.eliminar un elemento en especifico\n"
                                +"7.salir", "menu de opciones",3));
                
                switch (opcion){
                case 1:
                try{
                    el=(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento: ",
                            "insertando al inicio",3)));
                    //agregando al nodo
                    listita.agregaralFinal(el);
                    
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null,"error"+ n.getMessage());
                }
                
                break;
                
                case 2:
                    try{
                    el=(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento: ",
                            "insertando al final",3)));
                    //agregando al nodo
                    listita.agregarAlInicio(el);
                    
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null,"error"+ n.getMessage());
                }
                    break;
                    
                case 3:
                    listita.mostrarLista();
                    break;
                    
                case 4:
                    el=listita.BorrarDelInicio();
                    JOptionPane.showMessageDialog(null,"el elemento eliminado es:"
                            + el,"eliminando nodo del inicio",JOptionPane.INFORMATION_MESSAGE);
                    break;  
                case 5:
                   el=listita.BorrarDelFinal();
                   JOptionPane.showMessageDialog(null,"el elemento eliminado es:"
                            + el,"eliminando nodo del final",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                     el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el " 
                             + "elemento a eliminar...", "eliminando nodo en especifico", JOptionPane.INFORMATION_MESSAGE));
                     listita.EliminarCualquierNodo(el);
                     JOptionPane.showMessageDialog(null,"el elemento eliminado es:"
                            + el,"eliminando nodo en especifico",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"programa finalizado");
                    break;
                default:
                      JOptionPane.showMessageDialog(null,"opcion incorrecta");
                }
                
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"error"+ e.getMessage());
            }
        }while(opcion!=7);
        
      
        }
        }


