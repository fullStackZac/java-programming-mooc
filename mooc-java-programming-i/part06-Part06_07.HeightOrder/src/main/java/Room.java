/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if(this.persons.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {

            return null;
        }
        
        Person shortest = this.persons.get(0);

        for(Person prs: this.persons) {
            if(shortest.getHeight() > prs.getHeight()) {
                shortest = prs;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (persons.isEmpty()) {

            return null;
        }
        
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
