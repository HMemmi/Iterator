/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author memmi
 */
public class Person {
    private String name;
    private String eftername;
    private int id;

    public Person(String name, String eftername, int id) {
        this.name = name;
        this.eftername = eftername;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEftername() {
        return eftername;
    }

    public void setEftername(String eftername) {
        this.eftername = eftername;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString()
    {
    return "id:"+getId()+" eftername: "+getEftername()+" name: "+getName();
    }

}
