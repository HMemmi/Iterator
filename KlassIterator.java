/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author memmi
 */
public class KlassIterator implements Iterator<Person> {

    private static int position;
    private final ArrayList<Person> klass;
    public KlassIterator(ArrayList<Person> klass) {
        this.klass=klass;
        this.position=0;
    }

      @Override
    public Person next() {
         if(hasNext()) {  
            return klass.get(position++);
               
        } else {
            throw new NoSuchElementException("There are no elements size = " + klass.size());
        }
       
    }
    
    @Override
    public boolean hasNext() {
        
        return position<klass.size();
    }

    @Override
     public void remove(){
           
      klass.remove(--position);
        
    }
    
  

 
}
