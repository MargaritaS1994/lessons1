/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Strategy1;

/**
 *
 * @author user
 */
public class Sleeping implements Activity{
    
     @Override
    public void justDoIt() {
        System.out.println("sleeping...");
    }
    
}
