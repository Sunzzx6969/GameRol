/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamerollll;

/**
 *
 * @author Sultan
 */
public class GameRoLLLL {

    public static void main(String[] args) {
      
        Player superpowers = new Player();
        Player enemy       = new Player();
        
        superpowers.name = "Kim Naldo";
        superpowers.speed = 77;
        superpowers.healthPoin = 200;
        superpowers.damage = 45;
        superpowers.armor = 42;
        superpowers.switchj=70;
        
        enemy.name = "Pessi";
        enemy.speed = 82;
        enemy.healthPoin = 200;
        enemy.damage = 39;
        enemy.armor = 39;
        enemy.switchj= 60;
        
        
        superpowers.run();
        enemy.run();
        superpowers.attack();
        enemy.defend();
        enemy.attack();
        superpowers.defend();
        superpowers.Dribble();
        enemy.attack();
        superpowers.attack();
        enemy.defend();
        superpowers.attack();
        enemy.isDead();
        
        
        
        
        
        if (superpowers.isDead()) {
            System.out.println("PESSI WIN  ");
            
        } else  {
                System.out.println("KIM NALDO WIN");
                
            }
            
          
            
        }

    }


