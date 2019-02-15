/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mnogopoto4nost;

/**
 *
 * @author user1
 */
public class ex1 {
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName());
        
        Thread thread = new Thread();
        
        thread.start();
        
        System.out.println(thread.getName());
    }
    
}
