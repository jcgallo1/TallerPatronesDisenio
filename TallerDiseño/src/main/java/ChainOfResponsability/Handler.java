/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author User
 */
public interface Handler {
    //establece el siguiente Hadler
    void setNext(Handler h);
    //aprueba 
    void manejar();
    
}
