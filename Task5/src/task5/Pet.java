/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author YOGA
 */
abstract class Pet {
    private String name;
    public Pet(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}
