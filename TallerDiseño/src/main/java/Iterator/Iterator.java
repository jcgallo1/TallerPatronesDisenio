/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author User
 */
public interface Iterator {
    //Obtiene el siguiente objeto a iterar
    void getNext();
    //valida que es el siguiente objeto 
    boolean hasNext();
}
