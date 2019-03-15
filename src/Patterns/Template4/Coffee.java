/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Template4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Coffee extends HotDrink {
    
    @Override
    void brew() {
        System.out.println("zavarivaem kofe");
    }
    @Override
    void addIngridients() {
        System.out.println("dobavljaem moloko");
        
    }
    @Override
    boolean customerWantsIngridients() {
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("y")) {
            return true;
        }else
        {
            return false;
        }
    }
    private String getUserInput() {
        String answer = null;
        System.out.println("Hotite dobavit molka?");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            System.err.println("Error");
        }
        if(answer == null) {
            return "no";
        }
        return answer;
        }
    }
    

