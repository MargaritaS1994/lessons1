/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FartoryMethodWithArray;

import java.util.List;

/**
 *
 * @author user1
 */
public class Main {
        public static void main(String[] arg) {
        Company gameCompany = new GameDevCompany();
        List computerWorkers = gameCompany.getEmploees();
        gameCompany.startWorking(computerWorkers);
        
         Company constructionCompany = new ConstructionCompany();
        List constructionWorks = constructionCompany.getEmploees();
        constructionCompany.startWorking(constructionWorks);
}
}
