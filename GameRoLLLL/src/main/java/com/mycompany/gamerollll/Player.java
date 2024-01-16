/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamerollll;

/**
 *
 * @author Sultan
 */
public class Player {
     //atribut
    String name;
    int speed,healthPoin,damage,armor,switchj;
    
    //method
    void run(){
        System.out.println(name+" is Running....");
        System.out.println("Speed " + speed);
    }
    
    void attack(){
        System.out.println(name+" is Attacking...");
        System.out.println("Attack " + damage );
        if (damage <0) {
           System.out.println(healthPoin - damage);
       }
    }
    
    void defend(){
        System.out.println(name+" is Defending....");
        System.out.println(healthPoin - (damage+armor));
    }
    void Dribble(){
        System.out.println(name+" is Switch....");
        System.out.println(healthPoin + armor);
    }
    
    boolean isDead(){
        if (healthPoin<=0) return true;
            return false;
    }
}


