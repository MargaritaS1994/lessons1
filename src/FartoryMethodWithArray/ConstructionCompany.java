/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FartoryMethodWithArray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user1
 */
class ConstructionCompany extends Company {

    @Override
    List getEmploees() {
        System.out.println("");
        System.out.println("Starting company activity" + ConstructionCompany.class.getSimpleName() + "/n");
        List employee = new ArrayList();
        employee.add(new Electric());
        employee.add(new Prorab());
        employee.add(new Direktor());
        
                   for (int i = 1; i <= 10; i++) {
      employee.add(new Builder());
      
      
    }
        

        return employee;
    }
}
