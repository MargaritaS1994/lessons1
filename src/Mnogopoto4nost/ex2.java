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
public class ex2 {
    static class Recipe implements Runnable{
        
        @Override
        public void run() {
            
            System.err.println("..gotovim po receptu...");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());
        thread.start();
        
        thread.setName("Cook");
        System.err.println(thread.getName());
        System.err.println(Thread.currentThread().getName());
    }
    
}
