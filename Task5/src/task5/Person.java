/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

import java.util.ArrayList;

/**
 *
 * @author YOGA
 */
public class Person {
    private String name;
    private ArrayList<Pet> pets;
    
    public Person(String name){
        this.name = name;
        pets = new ArrayList<Pet>();
    }
    public Pet petSearch(String petName){
        for(Pet pet: pets){
            if(pet.getName().equalsIgnoreCase(petName)){
                return pet;
            }
        }
        return null;
    }
    
    public boolean petSearch(Pet aPet){
        for(Pet pet: pets){
            if(pet == aPet)
                return true;
        }
        return false;
        
    }
    
    public void addPet(Pet aPet) throws DuplicateInformation{
        if (petSearch(aPet) == true){
            throw new DuplicateInformation("Pet already existed");
        }
        if (petSearch(aPet.getName())!= null){
            throw new DuplicateInformation("Pet already existed");
        }
        pets.add(aPet);
//        System.out.println(aPet);
    }
    
    public String getName(){
        return name;
    }
    
    public void list(){
        for(Pet p: pets){
            System.out.println(p.getName());
        } 
    }
    
}


