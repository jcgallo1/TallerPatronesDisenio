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
public class ProductosIterator implements Iterator {
    
    private ProductorCollection collection;
    private Iterator IterationState;
    
    
    public void productosIterator(ProductorCollection c){
        //Constructor
    }

    @Override
    public void getNext() {
        //Itera al producto siguiente
    }

    @Override
    public boolean hasNext() {
        //verifica que sea el siguiente producto
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
    
}
