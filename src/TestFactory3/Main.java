/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3;

/**
 *
 * @author user1
 */
public class Main {
    public static void main(String[] arg) {
        Company gameCompany = new GameDevCompany();
        Employee[] computerWorkers = gameCompany.getEmploees();
        gameCompany.startWorking(computerWorkers);
        
         Company cleaningCompany = new CleaningCompany();
        Employee[] cleaningWorks = cleaningCompany.getEmploees();
        cleaningCompany.startWorking(cleaningWorks);
        
         Company constructionCompany = new ConstructionCompany();
        Employee[] constructionWorks = constructionCompany.getEmploees();
        constructionCompany.startWorking(constructionWorks);
    }
    
}
