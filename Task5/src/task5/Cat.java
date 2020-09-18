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
public class Cat extends Pet {
    public Cat(String name){
        super(name);
    }
    public void run(){
        System.out.println("( "+getName()+" ) Meow!");
    }
}
