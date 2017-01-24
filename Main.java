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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Person p1=new Person("Johansson","memmi",222);
       Person p2=new Person("Zlatan","memmis",222);
       Person p3=new Person("Ronaldo","hederi",222);
       Person p4=new Person("Messi","moahemd",222);

       
       
       Klass k=new Klass("2d","vetenskap");
       k.addPerson2class(p1);
       k.addPerson2class(p2);
       k.addPerson2class(p3);
       k.addPerson2class(p4);
       
       StringBuilder person=new StringBuilder();
             
       person.append("Ronaldo");
       String s=person.toString();
KlassIterator it=(KlassIterator) k.iterator();
             
     for(Person p:k) {
           
    
            if(s.equals(p.getName()))
                   it.remove();      
       }
     
     
     for(Person p:k) {
           
            System.out.println(p.getName()); 
          
       }
       
       
       
       
       
       
       
       
       
       
       
       
      /* Course c=new Course("h","b","n");
       c.add(p4);*/
 
       
       
       
              
       
        /*for(Person p:c)
       {
       System.out.println(p.getName());
       
       }*/
       
       
             
       
       
       
    }
    
}
