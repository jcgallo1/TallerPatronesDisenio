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
public class BaseHandler implements Handler{
    private Handler next;

    @Override
        //establece el siguiente Hadler
    public void setNext(Handler h) {
        
    }
    //aprueba 
    @Override
    public void manejar() {

    }
    
}
