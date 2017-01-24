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
public class Course implements Iterable<Person> {
    private String name;
    private String id;
    private String nivå;
    private ArrayList<Person> course=new ArrayList<>();

    public Course(String name, String id, String nivå) {
        this.name = name;
        this.id = id;
        this.nivå = nivå;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNivå() {
        return nivå;
    }

    public void setNivå(String nivå) {
        this.nivå = nivå;
    }
    public void add(Person p)
    {
    course.add(p);
    }

    @Override
    public Iterator<Person> iterator() {
      return new CourceIterator();
  

    }

    private class CourceIterator implements Iterator<Person> {
        
        private int position=0;

        public CourceIterator() {
        }

        @Override
        public boolean hasNext() {
          return position<course.size();
        }

        @Override
        public Person next() {
           Person p=course.get(position);
           position++;
           return p;
        }
    }
}



