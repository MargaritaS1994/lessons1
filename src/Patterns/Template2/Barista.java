/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Template2;

/**
 *
 * @author user
 */
public class Barista {
    
    public static void main(String[] args) {
        
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea....");
        tea.prepareRecipe();
        System.out.println("Making coffeee....");
        coffee.prepareRecipe();
    }
    
}
