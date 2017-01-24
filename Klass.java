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
public class Klass implements Iterable<Person>{
    private String byggnad;
    private String trappa;
    int position=0;
    private ArrayList<Person> klass=new ArrayList<>();

    public Klass(String byggnad, String trappa) {
        this.byggnad = byggnad;
        this.trappa = trappa;
    }

    public String getByggnad() {
        return byggnad;
    }

    public void setByggnad(String byggnad) {
        this.byggnad = byggnad;
    }

    public String getTrappa() {
        return trappa;
    }

    public void setTrappa(String trappa) {
        this.trappa = trappa;
    }
    
    public void addPerson2class(Person p)
    {
    klass.add(p);
    }

    @Override
    public Iterator<Person> iterator() {
        return new KlassIterator(klass);
    }

  /* void remove(int n) {
        klass.remove(n);
    }*/


  
 
}
