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
public class CleaningCompany extends Company { 
     @Override
    Employee[] getEmploees() {
        System.out.println("");
        System.out.println("Starting company activity" +CleaningCompany.class.getSimpleName() + "/n");
        Employee[] employee = new Employee[4];
        employee[0] = new Cleaning();
        employee[1] = new Cleaning();
        employee[2] = new Cleaning();
        employee[3] = new Manager();
       
        
        return employee;
    }
}
    
