/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.TemplateKR;

/**
 *
 * @author user
 */
public abstract class Menu {
        public void showPage() {
      
        System.out.println("Zakuski");
        System.out.println("Desert");
        showPageContent();
        System.out.println("Vqpe4ka");
        System.out.println("Gorja4ie bljuda");
        showPageContent();
        System.out.println("Holodnqe bljuda");
    }
    public abstract void showPageContent();
    
}

