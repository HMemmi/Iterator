/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author memmi
 */
public class KlassIterator implements Iterator<Person> {

    int n;
    private int position;
    private ArrayList<Person> klass;
    public KlassIterator(ArrayList<Person> klass) {
        this.klass=klass;
    }

    @Override
    public boolean hasNext() {
        klass=new ArrayList<Person>();
        return position<klass.size();
    }

    @Override
    public Person next() {
        
        Person p=klass.get(position);
         n= position++;
       System.out.println(n);


       return p;          
    }

 
    @Override
     public void remove(){
           
        klass.remove(n);
        
    }
    
}
