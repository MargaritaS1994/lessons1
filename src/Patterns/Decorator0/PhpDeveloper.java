/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Decorator0;

/**
 *
 * @author user
 */
public class PhpDeveloper implements Developer {
    
    @Override
    public String makeJob() {
        return "write PHP code...";
    }
    
}
